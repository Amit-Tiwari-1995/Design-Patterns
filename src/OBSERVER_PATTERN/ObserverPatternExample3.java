package OBSERVER_PATTERN;

import java.util.*;

interface StockObservable {
	public void addObserver(StockNotificationObserver observer);

	public void removeObserver(StockNotificationObserver observer);

	public void notifySubcribers();

	public void setStockCount(int newStockCount);

	public int getStockCount();
}

interface StockNotificationObserver {
	public void update();
}

class StockObservableImpl implements StockObservable {

	private List<StockNotificationObserver> observersList = new ArrayList<>();
	private int stockCount = 0;

	public void addObserver(StockNotificationObserver observer) {
		this.observersList.add(observer);
	}

	public void removeObserver(StockNotificationObserver observer) {
		this.observersList.remove(observer);
	}

	public void notifySubcribers() {

		for (StockNotificationObserver observer : this.observersList) {
			observer.update();
		}

	}

	public void setStockCount(int newStockCount) {

		if (stockCount == 0) {
			notifySubcribers();
		}

		stockCount = stockCount + newStockCount;
	}

	public int getStockCount() {

		return stockCount;
	}

}

class EmailAlertObserver implements StockNotificationObserver {
	String emailId;

	public EmailAlertObserver(String emailId) {
		this.emailId = emailId;
	}

	public void update() {
		sendMail(this.emailId);
	}

	public void sendMail(String emailId) {
		System.out.println("email send to id: " + emailId);
	}

}

class SMSAlertObserver implements StockNotificationObserver {
	String emailId;

	public SMSAlertObserver(String emailId) {
		this.emailId = emailId;
	}

	public void update() {
		sendMail(this.emailId);
	}

	public void sendMail(String emailId) {
		System.out.println("email send to id: " + emailId);
	}

}

public class ObserverPatternExample3 {

	public static void main(String[] args) {

		StockObservable obsevervable = new StockObservableImpl();

		StockNotificationObserver observer1 = new EmailAlertObserver("gmail.com");

		StockNotificationObserver observer2 = new SMSAlertObserver("microsoft.com");

		obsevervable.addObserver(observer1);

		obsevervable.addObserver(observer2);

		obsevervable.setStockCount(10);

	}
}
