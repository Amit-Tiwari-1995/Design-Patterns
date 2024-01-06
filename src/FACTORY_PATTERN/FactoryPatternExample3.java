package FACTORY_PATTERN;

interface Bhagwan {
	public void darshan();
}

class Vishnu implements Bhagwan {

	public void darshan() {
		System.out.println("Vishnu Bhagwan Darshan!!!");
	}

}

class Brahma implements Bhagwan {

	public void darshan() {
		System.out.println("Brahma Bhagwan Darshan!!!");
	}

}

class Shiva implements Bhagwan {

	public void darshan() {
		System.out.println("Shiv Bhagwan Darshan!!!");
	}

}

class Prayer {
	public static Bhagwan getDarshan(String msg) {
		switch (msg) {
		case "vishnu":
			return new Vishnu();

		case "brahma":
			return new Brahma();

		case "shiv":
			return new Shiva();

		default:

			return null;

		}

	}
}

public class FactoryPatternExample3 {

	public static void main(String[] args) {

		Bhagwan bhagwan = Prayer.getDarshan("brahma");
		bhagwan.darshan();

	}

}
