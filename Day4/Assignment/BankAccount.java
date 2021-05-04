
public class BankAccount {
	private String username;
	private double balance;
	private double startingBalance;
	
	public BankAccount(String username, double balance, double startingBalance) {
		this.username = username;
		this.balance = balance;
		this.startingBalance = startingBalance;
		
	}
	
	public String getUsername() {
		return username;
	}
	public double getBalance() {
		return balance;
	}
	public double getStartingBalance() {
		return startingBalance;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setStartingBalance(double startingBalance) {
		this.startingBalance = startingBalance;
	}

	
	

}
