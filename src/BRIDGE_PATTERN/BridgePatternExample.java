package BRIDGE_PATTERN;

abstract class TV {
	Remote remote;

	public TV(Remote r) {
		this.remote = r;
	}

	abstract void on();

	abstract void off();
}

interface Remote {
	public void on();

	public void off();

}

class Sony extends TV {
	Remote remoteType;

	public Sony(Remote r) {
		super(r);
		this.remoteType = r;
	}

	void on() {
		System.out.println("SONY TV is on");
		remoteType.on();

	}

	void off() {

		System.out.println("SONY TV is off");
		remoteType.off();
	}

}

class Philips extends TV {
	Remote remoteType;

	public Philips(Remote r) {
		super(r);
		this.remoteType = r;
	}

	void on() {
		System.out.println("Philips TV is on");
		remoteType.on();

	}

	void off() {

		System.out.println("Philips TV is off");
		remoteType.off();
	}

}

class OldRemote implements Remote {

	public void on() {
		System.out.println("Old Remote is ON");
	}

	public void off() {

		System.out.println("Old Remote is OFF");
	}

}

class NewRemote implements Remote {

	public void on() {
		System.out.println("New Remote is ON");
	}

	public void off() {

		System.out.println("New Remote is OFF");
	}

}

public class BridgePatternExample {

	public static void main(String[] args) {
		
		TV sonyOldRemote = new Sony(new OldRemote());
		sonyOldRemote.on();
		sonyOldRemote.off();
		
		System.out.println();
		

		TV sonyNewRemote = new Sony(new NewRemote());
		sonyNewRemote.on();
		sonyNewRemote.off();
		
		System.out.println();
		
		
		
		TV philipsOldRemote = new Sony(new OldRemote());
		philipsOldRemote.on();
		philipsOldRemote.off();
		
		System.out.println();
		

		TV philipsNewRemote = new Sony(new NewRemote());
		philipsNewRemote.on();
		philipsNewRemote.off();
		
		

	}

}
