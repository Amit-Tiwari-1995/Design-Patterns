package OBSERVER_PATTERN;

import java.util.*;

interface Subject {
	public void register(Observer obj);

	public void unregister(Observer obj);

	public void notifyObserver();
}

class DeliveryData implements Subject {

	ArrayList<Observer> observers;
	String location;
	public DeliveryData() {
		this.observers = new ArrayList<>();
	}

	public void register(Observer obj) {

		observers.add(obj);
	}

	public void unregister(Observer obj) {

		observers.remove(obj);

	}

	public void notifyObserver() {

		for (Observer observer : this.observers) {
			observer.updateLocation(this.location);

		}

	}

	public void locationChange() {
		this.location = getLocation();
		notifyObserver();
	}

	public String getLocation() {
		return "XyzLocation";
	}

}

interface Observer {

	public void updateLocation(String location);

}

class WareHouse implements Observer {
	String location;

	public void updateLocation(String location) {
		this.location = location;
		showLocation();

	}

	public void showLocation() {
		System.out.println("Notification at Ware house: current location is: " + location);
	}

}

class User implements Observer {
	String location;

	public void updateLocation(String location) {
		this.location = location;
		showLocation();

	}

	public void showLocation() {
		System.out.println("Notification at User: current location is: " + location);
	}

}

class Seller implements Observer {
	String location;

	public void updateLocation(String location) {
		this.location = location;
		showLocation();

	}

	public void showLocation() {
		System.out.println("Notification at Seller: current location is: " + location);
	}

}

public class ObserverPatternExample {
	
	public static void main(String[] args) {
		
		DeliveryData topic = new DeliveryData();
		
		Observer obs1 = new WareHouse();

		Observer obs2 = new User();

		Observer obs3 = new Seller();
		
		topic.register(obs1);
		topic.register(obs2);
		topic.register(obs3);
		
		topic.locationChange();
		
		System.out.println();
		topic.unregister(obs1);
		
		topic.locationChange();
		
		
		
		
	}
}
