package design_pattern_observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{
	private int state=10;
	private List <Observer>observers=new ArrayList<>();

	@Override
	public void subscribe(Observer o) {
		this.observers.add(o);
		
	}

	@Override
	public void unSubscribe(Observer o) {
		this.observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer o:observers) {
			o.update(this);
		}
		
	}

	public void setState(int state) {
		this.state = state;
		this.notifyObservers();
	}

	public int getState() {
		return state;
	}
	
	
	
	

}
