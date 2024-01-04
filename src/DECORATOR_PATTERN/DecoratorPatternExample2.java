package DECORATOR_PATTERN;

interface Car {
	public void assemble();
}

class BasicCar implements Car {

	public void assemble() {
		System.out.println("Assemble a basic car");

	}

}

class DecoratorCar implements Car {
	Car car;

	public DecoratorCar(Car car) {
		this.car = car;
	}

	public void assemble() {
		this.car.assemble();

	}

}

class LuxuryCar extends DecoratorCar {

	public LuxuryCar(Car car) {
		super(car);
	}

	public void assemble() {
		super.assemble();
		System.out.println("Assemble a Luxury car");
	}

}

class SportsCar extends DecoratorCar {

	public SportsCar(Car car) {
		super(car);
	}

	public void assemble() {
		super.assemble();
		System.out.println("Assemble a Sports car");
	}

}

public class DecoratorPatternExample2 {

	public static void main(String[] args) {

		Car car = new SportsCar(new LuxuryCar(new BasicCar()));
		car.assemble();

	}

}
