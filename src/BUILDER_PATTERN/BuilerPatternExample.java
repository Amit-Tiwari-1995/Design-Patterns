package BUILDER_PATTERN;

class Vehicle {
	// required parameters
	private String engine;
	private int wheels;

	// optional parameters
	private int airBags;

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getAirBags() {
		return airBags;
	}

	private Vehicle(VehicleBuilder vehicleBuilder) {
		this.engine = vehicleBuilder.engine;
		this.wheels = vehicleBuilder.wheels;
		this.airBags = vehicleBuilder.airBags;
	}

	public static class VehicleBuilder {

		private String engine;
		private int wheels;

		private int airBags;

		public VehicleBuilder(String engine, int wheels) {
			this.engine = engine;
			this.wheels = wheels;
		}

		public VehicleBuilder setAirBags(int airBags) {
			this.airBags = airBags;
			return this;
		}

		public Vehicle build() {
			return new Vehicle(this);
		}

	}

}

public class BuilerPatternExample {
	
	public static void main(String[] args) {
		
		Vehicle car =  new Vehicle.VehicleBuilder("1500cc", 4).setAirBags(4).build();
		Vehicle bike= new Vehicle.VehicleBuilder("250cc", 2).build();
		
		System.out.println(car.getEngine());
		System.out.println(car.getWheels());
		System.out.println(car.getAirBags());
		
		

		System.out.println(bike.getEngine());
		System.out.println(bike.getWheels());
		System.out.println(bike.getAirBags());
		
		
		
		
		
	}

}
