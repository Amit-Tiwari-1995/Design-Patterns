package DECORATOR_PATTERN;

interface Dress {
	public void assemble();

}

class BasicDress implements Dress {

	public void assemble() {

		System.out.println("Basic dress features");
	}

}

class DecoratorDress implements Dress {
	protected Dress dress;

	public DecoratorDress(Dress d) {
		this.dress = d;
	}

	public void assemble() {

		this.dress.assemble();

	}

}

class SportyDress extends DecoratorDress {

	public SportyDress(Dress d) {

		super(d);

	}

	public void assemble() {
		super.assemble();
		System.out.println("Sport Dress feature");

	}

}

class FancyDress extends DecoratorDress {
	public FancyDress(Dress d) {
		super(d);
	}

	public void assemble() {
		super.assemble();
		System.out.println("Fancy Dress features");
	}

}

class CasualDress extends DecoratorDress {

	public CasualDress(Dress d) {
		super(d);
	}

	public void assemble() {
		super.assemble();
		System.out.println("Casual Dress features");
	}

}

public class DecoratorPatternExample {

	public static void main(String[] args) {

		Dress sportyDress = new SportyDress(new BasicDress());
		sportyDress.assemble();

		sportyDress = new SportyDress(new CasualDress(new BasicDress()));
		sportyDress.assemble();

	}

}
