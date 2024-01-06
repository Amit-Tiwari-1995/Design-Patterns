package OBSERVER_PATTERN;

import java.util.*;

interface WorkStationTemperatureObservable {
	public void addObserver();

	public void removeObserver();

	public void notifyTemp();

	public void setTemp(int temperature);
}

interface WorkStationObserver {
	public void update(int temperature);

}

class WorkStationTemperatureObservableImpl implements WorkStationTemperatureObservable {
	List<WorkStationObserver> listObservers;
	WorkStationObserver workStationObserver;

	int temperature;

	public WorkStationTemperatureObservableImpl(WorkStationObserver workStationObserver) {
		this.workStationObserver = workStationObserver;
		listObservers=new ArrayList<WorkStationObserver>();
	}

	public void addObserver() {

		listObservers.add(workStationObserver);

	}

	public void removeObserver() {

		listObservers.remove(workStationObserver);

	}

	public void notifyTemp() {

		for (WorkStationObserver workStationObserver : this.listObservers) {

			workStationObserver.update(this.temperature);

		}

	}

	public void setTemp(int temperature) {
		this.temperature = temperature;
		notifyTemp();
	}
	

}

class TvDisplay implements WorkStationObserver {

	public void update(int temperature) {

		System.out.println("TV display current temperture: " + temperature);
	}

}

class MobileDisplay implements WorkStationObserver {

	public void update(int temperature) {

		System.out.println("Mobile display current temperture: " + temperature);

	}

}

public class ObserverPatternExample2 {

	public static void main(String[] args) {
		
		
		WorkStationTemperatureObservable obj1 = new WorkStationTemperatureObservableImpl(new TvDisplay());

		WorkStationTemperatureObservable obj2 = new WorkStationTemperatureObservableImpl(new MobileDisplay());
		
		obj1.addObserver(); 
		obj1.setTemp(23);
		
		obj2.addObserver();
		obj2.setTemp(25);
		
		obj1.removeObserver();
		obj1.setTemp(25);
		
		
		

	}
}
