package PROTOTYPE_PATTERN;

import java.util.*;

class Vehicle implements Cloneable {
	private List<String> vehicleList;

	public Vehicle() {
		this.vehicleList = new ArrayList<String>();
	}

	public Vehicle(List<String> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public void insertData() {
		this.vehicleList.add("Honda Amaze");
		this.vehicleList.add("Tata Punch");
		this.vehicleList.add("Hyundai Creta");
		this.vehicleList.add("Tata Harrier");
	}

	public List<String> getVehicleList() {
		return this.vehicleList;
	}

	public Object clone() throws CloneNotSupportedException {
		List<String> tempList = new ArrayList<String>();

		for (String s : this.getVehicleList()) {
			tempList.add(s);
		}

		return new Vehicle(tempList);

	}

}

public class PrototypePatternExample {

	public static void main(String[] args) throws CloneNotSupportedException {

		Vehicle v1 = new Vehicle();
		v1.insertData();

		Vehicle v2 = (Vehicle) (v1.clone());
		List<String> list = v2.getVehicleList();

		list.add("TATA Nexon");

		System.out.println(v1.getVehicleList());
		System.out.println(list);

	}

}
