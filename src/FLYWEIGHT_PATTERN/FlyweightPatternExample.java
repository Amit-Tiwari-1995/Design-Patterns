package FLYWEIGHT_PATTERN;

import java.util.*;

interface Employee {
	public void assignSkill(String skill);

	public void task();
}

class Developer implements Employee {

	private String JOB;
	private String skill;

	public Developer() {
		JOB = "Fix the issue";
	}

	public void assignSkill(String skill) {
		this.skill = skill;
	}

	public void task() {
		System.out.println("Developer with skill: " + this.skill + " with Job: " + this.JOB);
	}

}

class Tester implements Employee {

	private String JOB;
	private String skill;

	public Tester() {
		JOB = "Test the issue";
	}

	public void assignSkill(String skill) {
		this.skill = skill;
	}

	public void task() {
		System.out.println("Tester with skill: " + this.skill + " with Job: " + this.JOB);
	}

}

class EmployeeFactory {

	private static HashMap<String, Employee> m = new HashMap<String, Employee>();

	public static Employee getEmployee(String type) {
		Employee e = null;

		if (m.get(type) != null) {
			e = m.get(type);
		} else {
			switch (type) {
			case "Developer":
				System.out.println("Developer created");
				e = new Developer();
				break;

			case "Tester":
				System.out.println("Tester created");
				e = new Tester();
				break;

			default:

				System.out.println("No such employee existed");

			}

			m.put(type, e);

		}

		return e;

	}

}

public class FlyweightPatternExample {

	private static String employeeType[] = { "Developer", "Tester" };
	private static String skills[] = { "C++", "Java", "Python", "JS" };

	public static void main(String[] args) {

		for (int i = 1; i <= 2; i++) {

			Employee e = EmployeeFactory.getEmployee(getRandomEmployee());
			e.assignSkill(getRandomSkill());
			e.task();

		}

	}

	public static String getRandomEmployee() {
		Random random = new Random();
		int position = random.nextInt(employeeType.length);

		return employeeType[position];
	}

	public static String getRandomSkill() {
		Random random = new Random();
		int position = random.nextInt(skills.length);

		return skills[position];
	}

}
