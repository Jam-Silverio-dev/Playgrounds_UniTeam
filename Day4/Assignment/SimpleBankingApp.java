import java.util.Scanner;

public class SimpleBankingApp {
	private static double balance;

	public static BankAccount nBankAccount;
	public static Scanner sc = new Scanner(System.in);
	public static String currency = "$";
	
	public static void main(String[] args) {
		
		clientInformation();
		

	}
	
	public static void clientInformation() {
		System.out.println("***WELCOME TO THE BANK***");
		System.out.println("\nClient name: >>");
		String username = sc.next();
		System.out.println("Starting balance: >>");
		double startingBalance = sc.nextDouble();
		nBankAccount = new BankAccount(username, startingBalance, startingBalance);
		System.out.println("\nWelcome, " + username + "! \nYour starting balance is " + currency + startingBalance + ".");

		menu();
	}

	public static void menu() {
		System.out.println("\n***BANKING MENU***");
		System.out.println("1-Check Balance");
		System.out.println("2-Add Funds");
		System.out.println("3-Transfer Funds");
		System.out.println("4-Exit the program");
		

		selectOperation();
	}
	
	public static void selectOperation() {
		System.out.println("\nChoose from the menu.");
		int choice = sc.nextInt();
		
		switch (choice) {
			case 1:	
				checkBalance();
				break;
			case 2:
				addFunds();
				break;
			case 3:
				transferFunds();
				break;
			case 4:
				System.out.println("Are you sure you want to leave," + nBankAccount.getUsername() + "? Type 1-Yes or 2-No.");
				choice = sc.nextInt();
				if (choice == 1) {
					System.out.println("\nThank you! Come back again.");
					sc.close();
					System.exit(0);
				} else if (choice == 2) {
					selectOperation();
				} else {
					System.out.println("Invalid input.");
					selectOperation();
				}
				
				break;
			default:
				System.out.println("Invalid input.");
				selectOperation();
				break;
		}
	}
	
	public static void checkBalance() {
		System.out.println("Balance is >> " + currency + nBankAccount.getBalance());
		willExit();

	}
	
	public static void addFunds() {
		System.out.println("How much will be deposited?");
		double deposit = sc.nextDouble();
		System.out.println("\nThe amount to be deposited is: " + currency + deposit);
		System.out.println("Do you want to continue? Type 1-Yes or 2-No.");
		int choice = sc.nextInt();
		if (choice == 1) {
			
			balance = nBankAccount.getBalance();
			balance += deposit;
			nBankAccount.setBalance(balance);
			System.out.println("You have successfully deposited "  + currency + deposit);
			System.out.println("Your new balance is " + currency + nBankAccount.getBalance() + ".");
			willExit();
		} else if (choice == 2) {
			selectOperation();
		} else {
			System.out.println("Invalid input.");
			addFunds();
		}
		
	}
	
	public static void transferFunds() {

		balance = nBankAccount.getBalance();
		System.out.println("\nYOUR CURRENT BALANCE is " + currency + balance + ".");
		System.out.println("How much will be withdrawn?");
		double withdraw = sc.nextDouble();
		System.out.println("Updated balance is " + balance);
		if ((balance - withdraw) == 0 || (balance - withdraw) < 100) {

			System.out.println("\nSorry, you must leave at least " + currency + "100 in your balance.");
			willExit();
		} else if ((balance -= withdraw) < 0) {
			System.out.println("\nSorry, you can't withdraw beyond your balance.");
			willExit();
		} else {
			System.out.println("\nThe amount to be withdrawn is: " + currency + withdraw);
			System.out.println("Do you want to continue? Type 1-Yes or 2-No.");
			int choice = sc.nextInt();
			if (choice == 1) {
				

			balance -= withdraw;
			nBankAccount.setBalance(balance);
			System.out.println("You have successfully withdrawn "  + currency + withdraw);
			System.out.println("Your new balance is " + currency + nBankAccount.getBalance() + ".");
			willExit();
			

			} else if (choice == 2) {
				transferFunds();
			} else {
				System.out.println("Invalid input.");
				addFunds();
			}
		}
		
	}
	
	public static void willExit() {
		System.out.println("\nDo you want to exit? Type 1-Yes or 2-No.");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("\nThank you, " + nBankAccount.getUsername() + "! Come back again.");
			sc.close();
			System.exit(0);
		} else if (choice == 2) {
			menu();
		} else {
			System.out.println("Invalid input.");
			willExit();
		}
	}
	
}
