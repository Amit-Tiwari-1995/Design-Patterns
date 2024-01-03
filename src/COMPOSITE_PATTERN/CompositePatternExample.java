package COMPOSITE_PATTERN;

import java.util.*;

interface Account {
	public float getBalance();

}

class SavingsAccount implements Account {
	private int accountNumber;
	private float accountBalance;

	public SavingsAccount(int accountNumber, float accountBalance) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;

	}

	public float getBalance() {

		return this.accountBalance;
	}

}

class DepositAccount implements Account {
	private int accountNumber;
	private float accountBalance;

	public DepositAccount(int accountNumber, float accountBalance) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;

	}

	public float getBalance() {

		return this.accountBalance;
	}

}

class CompositeAccount implements Account

{
	private float totalBalance;
	private List<Account> accounts = new ArrayList<Account>();

	public float getBalance() {
		totalBalance = 0;

		for (Account a : accounts) {
			totalBalance = totalBalance + a.getBalance();
		}

		return totalBalance;

	}

	public void addAccount(Account a) {
		accounts.add(a);
	}

	public void removeAccount(Account a) {
		accounts.remove(a);
	}

}

public class CompositePatternExample {

	public static void main(String[] args) {

		CompositeAccount composite = new CompositeAccount();

		composite.addAccount(new SavingsAccount(101, 1100));

		composite.addAccount(new SavingsAccount(102, 2100));

		composite.addAccount(new DepositAccount(103, 4500));

		float totalBalance = composite.getBalance();

		System.out.println(totalBalance);

	}

}
