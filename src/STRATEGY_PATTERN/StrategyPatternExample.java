package STRATEGY_PATTERN;

interface DriveStrategy {
	public void drive();
}

class NormalDriveStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Normal vehicle driving");

	}

}

class SportsVehicleStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Sports vehicle driving");

	}

}

class Vehicle {
	DriveStrategy driveStrategy;

	public Vehicle(DriveStrategy driveStrategy) {
		this.driveStrategy = driveStrategy;
	}

	public void drive() {
		this.driveStrategy.drive();
	}

}

class TataPunchCar extends Vehicle {

	public TataPunchCar() {
		super(new NormalDriveStrategy());
	}

}

class FerrariCar extends Vehicle {

	public FerrariCar() {
		super(new SportsVehicleStrategy());
	}

}

public class StrategyPatternExample {

	public static void main(String[] args) {
		
		
		Vehicle vehicle = new TataPunchCar();
		vehicle.drive();
		

		
		Vehicle vehicle2 = new FerrariCar();
		vehicle2.drive();

	}

}
