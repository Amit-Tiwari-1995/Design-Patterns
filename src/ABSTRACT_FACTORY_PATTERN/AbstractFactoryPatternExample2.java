package ABSTRACT_FACTORY_PATTERN;

interface Vehicle {
	public void drive();
}

class Car implements Vehicle {

	public void drive() {

		System.out.println("Driving car..");

	}

}

class Truck implements Vehicle {

	public void drive() {

		System.out.println("Driving truck..");

	}

}

interface AbstractFactoryVehicle {
	public Vehicle getVehicle();
}

class AbstractCar implements AbstractFactoryVehicle {

	public Vehicle getVehicle() {
		return new Car();
	}

}

class AbstractTruck implements AbstractFactoryVehicle {

	public Vehicle getVehicle() {
		return new Truck();
	}

}

class FactoryVehicle {
	public static Vehicle createVehicle(AbstractFactoryVehicle abstractFactoryVehicle) {
		return abstractFactoryVehicle.getVehicle();
	}
}

public class AbstractFactoryPatternExample2 {

	public static void main(String[] args) {
		
		Vehicle car = FactoryVehicle.createVehicle(new AbstractCar());
		car.drive();
		

		Vehicle truck = FactoryVehicle.createVehicle(new AbstractTruck());
		truck.drive();

	}

}
