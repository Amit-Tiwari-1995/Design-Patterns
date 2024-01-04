package BUILDER_PATTERN;

class Computer {
	// required parameters
	private String HDD;
	private String RAM;

	// optional parameters
	private boolean isBluetoothEnabled;
	private boolean isGraphicCardEnabled;

	public Computer(ComputerBuilder computerBuilder) {
		this.HDD = computerBuilder.HDD;
		this.RAM = computerBuilder.RAM;
		this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
		this.isGraphicCardEnabled = computerBuilder.isGraphicCardEnabled;
	}

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public boolean isGraphicCardEnabled() {
		return isGraphicCardEnabled;
	}

	public static class ComputerBuilder {
		// required parameters
		private String HDD;
		private String RAM;

		// optional parameters
		private boolean isBluetoothEnabled;
		private boolean isGraphicCardEnabled;

		public ComputerBuilder(String HDD, String RAM) {
			this.HDD = HDD;
			this.RAM = RAM;
		}

		public ComputerBuilder setIsBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public ComputerBuilder setisGraphicCardEnabled(boolean isGraphicCardEnabled) {
			this.isGraphicCardEnabled = isGraphicCardEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}

}

public class BuilerPatternExample2 {

	public static void main(String[] args) {

		Computer dellLaptop = new Computer.ComputerBuilder("1TB", "16GB").setIsBluetoothEnabled(true)
				.setisGraphicCardEnabled(true).build();
		System.out.println(dellLaptop.getHDD());
		System.out.println(dellLaptop.getRAM());
		System.out.println(dellLaptop.isGraphicCardEnabled());
		System.out.println(dellLaptop.isBluetoothEnabled());

		
		Computer mac = new Computer.ComputerBuilder("1TB", "32B").build();
		System.out.println(mac.getHDD());
		System.out.println(mac.getRAM());
		System.out.println(mac.isGraphicCardEnabled());
		System.out.println(mac.isBluetoothEnabled());

	}

}
