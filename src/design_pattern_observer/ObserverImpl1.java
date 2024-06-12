package design_pattern_observer;

public class ObserverImpl1 implements Observer{

	@Override
	public void update(Observable obs) {
		int state=((ObservableImpl)obs).getState();
		double result=state*state+9;
		System.out.println("***Observer Implementation 1***");
		System.out.println("New update state ="+state);
		System.out.println("Total result ="+result);
		
	}

}
