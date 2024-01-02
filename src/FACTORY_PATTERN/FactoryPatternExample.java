package FACTORY_PATTERN;

abstract class Vehicle {
	public abstract int getWheel();

	public String toString() {
		return "Wheel: " + this.getWheel();
	}

}

class Bike extends Vehicle {
	int wheel;

	public Bike(int wheel) {
		this.wheel = wheel;
	}

	public int getWheel() {
		return this.wheel;
	}

}

class Car extends Vehicle {
	int wheel;

	public Car(int wheel) {
		this.wheel = wheel;
	}

	public int getWheel() {
		return this.wheel;
	}

}

class Auto extends Vehicle {
	int wheel;

	public Auto(int wheel) {
		this.wheel = wheel;
	}

	public int getWheel() {
		return this.wheel;
	}

}

class VehicleFactory {

	public static Vehicle getVehicle(String vehicleType, int wheels) {
		if (vehicleType.equals("bike")) {
			return new Bike(wheels);
		} else if (vehicleType.equals("car")) {
			return new Car(wheels);
		} else if (vehicleType.equals("auto")) {
			return new Auto(wheels);
		} else {
			return null;
		}

	}

}

public class FactoryPatternExample {

	public static void main(String[] args) {

		Vehicle vehicle1 = VehicleFactory.getVehicle("bike", 2);
		System.out.println(vehicle1);

		Vehicle vehicle2 = VehicleFactory.getVehicle("car", 4);
		System.out.println(vehicle2);

		Vehicle vehicle3 = VehicleFactory.getVehicle("auto", 3);
		System.out.println(vehicle3);

	}

}
