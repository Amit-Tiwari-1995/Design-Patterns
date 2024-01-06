package ABSTRACT_FACTORY_PATTERN;

abstract class ComputerSystem {

	public abstract String getBrand();

	public abstract String getRam();

	public abstract String getProcessor();

	public String toString() {
		return "BRAND: " + this.getBrand() + ", RAM: " + this.getRam() + ", PROCESSOR: " + this.getProcessor();
	}

}

class LaptopSystem extends ComputerSystem {
	private String brand;

	private String ram;

	private String processor;

	public LaptopSystem(String brand, String ram, String processor) {
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

class DesktopSystem extends ComputerSystem {
	private String brand;

	private String ram;

	private String processor;

	public DesktopSystem(String brand, String ram, String processor) {
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

class ComputerSystemFactory {

	public static Computer getComputer(String msg, String brand, String ram, String processor) {

		switch (msg) {
		case "desktop":
			return new Laptop(brand, ram, processor);
		case "laptop":
			return new Desktop(brand, ram, processor);

		default:

			return null;

		}

	}

}

public class FactoryPatternExample {
	
	public static void main(String[] args) {
		
		Computer computer = ComputerSystemFactory.getComputer("laptop", "Dell", "16GB", "i5");
		System.out.println(computer);
		

		Computer computer2 = ComputerSystemFactory.getComputer("desktop", "HP", "32GB", "i7");
		System.out.println(computer2);
		
	}

}
