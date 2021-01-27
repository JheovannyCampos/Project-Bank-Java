package entities;

public class Account {
	private int Number;
	private String Holder;
	private double balance;	
	
	public Account(int number, String holder) {
		Number = number;
		Holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		Number = number;
		Holder = holder;
		deposit(initialDeposit);
	}

	@Override
	public String toString() {
		return "Account " + Number + ", Holder: " + Holder + ", balance: $" + balance + "";
	}

	public int getNumber() {
		return Number;
	}

	public String getHolder() {
		return Holder;
	}

	public void setHolder(String holder) {
		Holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {balance += amount;}
	public void withdraw(double amount) {balance -= amount + 5.00;}
}
