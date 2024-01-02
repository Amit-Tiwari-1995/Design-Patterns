package SINGLETON_PATTERN;

public class Singleton {

	private static Singleton singleton = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	public static void main(String[] args) {

		Singleton s1 = Singleton.getInstance();

		Singleton s2 = Singleton.getInstance();

		System.out.println(s1.hashCode() + " " + s2.hashCode());

	}

}
