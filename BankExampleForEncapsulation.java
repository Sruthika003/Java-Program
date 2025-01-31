package day14Exercise;

class Bank{
	private int  accountNumber;
	private double balance;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

public class BankExampleForEncapsulation {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.setAccountNumber(123456789);
		b.setBalance(50000);
		System.out.println(b.getAccountNumber());
		System.out.println(b.getBalance());
		
	}
}
