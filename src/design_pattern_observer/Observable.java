package design_pattern_observer;


public interface Observable  {

	public void subscribe(Observer o);//addObserver
	public void unSubscribe(Observer o);//removeOberserver
	public void notifyObservers();//send notification
}
