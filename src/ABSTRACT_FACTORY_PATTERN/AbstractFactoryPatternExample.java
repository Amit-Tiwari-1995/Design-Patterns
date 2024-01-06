package ABSTRACT_FACTORY_PATTERN;

abstract class Computer {

	public abstract String getBrand();

	public abstract String getRam();

	public abstract String getProcessor();

	public String toString() {
		return "BRAND: " + this.getBrand() + ", RAM: " + this.getRam() + ", PROCESSOR: " + this.getProcessor();
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

class Desktop extends Computer {
	private String brand;

	private String ram;

	private String processor;

	public Desktop(String brand, String ram, String processor) {
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

abstract class AbstractFactoryComputer {

	public abstract Computer createComputer();

}

class FactoryLaptop extends AbstractFactoryComputer {

	private String brand;

	private String ram;

	private String processor;

	public FactoryLaptop(String brand, String ram, String processor) {
		this.brand = brand;
		this.ram = ram;
		this.processor = processor;
	}

	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new Laptop(brand, ram, processor);

	}

}

class FactoryDesktop extends AbstractFactoryComputer {

	private String brand;

	private String ram;

	private String processor;

	public FactoryDesktop(String brand, String ram, String processor) {
		this.brand = brand;
		this.ram = ram;
		this.processor = processor;
	}

	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new Desktop(brand, ram, processor);

	}

}

class FactoryComputer {
	public static Computer getComputer(AbstractFactoryComputer abstractFactoryComputer) {
		return abstractFactoryComputer.createComputer();
	}
}

public class AbstractFactoryPatternExample {

	public static void main(String[] args) {

		Computer laptop = FactoryComputer.getComputer(new FactoryLaptop("dell", "16GB", "i5"));
		Computer desktop = FactoryComputer.getComputer(new FactoryDesktop("hp", "32GB", "i7"));

		System.out.println(laptop);
		System.out.println(desktop);

	}

}
