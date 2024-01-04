package FACTORY_PATTERN;

abstract class Computer {
	public abstract String getBrand();

	public abstract String getRam();

	public abstract String getProcessor();

	public String toString() {
		return "Brand: " + this.getBrand() + " Ram: " + this.getRam() + " Processor: " + this.getProcessor();
	}

}

class Laptop extends Computer {
	private String brand;
	private String ram;
	private String processor;

	public Laptop(String brand, String ram, String processor) {
		this.brand = brand;
		this.ram = ram;
		this.processor = processor;
	}

	public String getBrand() {
		return this.brand;
	}

	public String getRam() {
		return this.ram;
	}

	public String getProcessor() {

		return this.processor;
	}

}

class DeskTop extends Computer {
	private String brand;
	private String ram;
	private String processor;

	public DeskTop(String brand, String ram, String processor) {
		this.brand = brand;
		this.ram = ram;
		this.processor = processor;
	}

	public String getBrand() {
		return this.brand;
	}

	public String getRam() {
		return this.ram;
	}

	public String getProcessor() {

		return this.processor;
	}

}

class ComputerFactory {
	public static Computer getComputer(String computerType, String brand, String ram, String processor) {
		Computer computer = null;
		if (computerType.equalsIgnoreCase("laptop")) {
			computer = new Laptop(brand, ram, processor);
		} else if (computerType.equalsIgnoreCase("desktop")) {
			computer = new DeskTop(brand, ram, processor);
		} else {
			System.out.println("Not a valid type");
		}
		return computer;

	}

}

public class FactoryPatternExample2 {

	public static void main(String[] args) {

		Computer laptop = ComputerFactory.getComputer("laptop", "Dell", "16GB", "Intel i5");
		System.out.println(laptop);
		

		Computer desktop = ComputerFactory.getComputer("desktop", "HP", "32GB", "Intel i7");
		System.out.println(desktop);
		

		Computer mac = ComputerFactory.getComputer("mac", "Apple", "32GB", "Apple M1");
		System.out.println(mac);

	}

}
