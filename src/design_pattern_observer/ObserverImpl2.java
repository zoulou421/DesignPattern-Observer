package design_pattern_observer;

public class ObserverImpl2 implements Observer{
    private int counter;
	@Override
	public void update(Observable obs) {
		int state=((ObservableImpl)obs).getState();
		if(state%2==0) ++counter;
		System.out.println("***Observer Implementation 2***");
		System.out.println("New update state ="+state);
		System.out.println("Counter result is :"+counter);
		
	}

}
