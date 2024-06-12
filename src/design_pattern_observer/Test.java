package design_pattern_observer;

public class Test {

	public static void main(String[] args) {
		ObservableImpl observable=new ObservableImpl();
		Observer o1=new ObserverImpl1();
		Observer o2=new ObserverImpl2();
		Observer o3=new ObserverImpl1();
		
		observable.subscribe(o1);
		observable.subscribe(o2);
		
		observable.setState(55);
		observable.setState(10);
		observable.setState(20);
		observable.setState(2);
		

	}

}
