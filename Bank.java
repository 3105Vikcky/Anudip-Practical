//BANKING_APPLICATION
/*Write a Java program to simulate a simple banking application.
 *Create a class BankAccount with a balance and methods for deposit and withdrawal.
 *Implement exception handling for withdrawal operations to prevent overdrawing. 
 *Handle the scenario when the withdrawal amount is greater than the balance.
 */
import java.util.Scanner;
class BankAccount 
{
 private double balance; 
 public BankAccount(double initialBalance) 
 {
    balance = initialBalance;
 }
 
 public void deposit(double amount) 
 {
	 if (amount > 0) 
	 {
		 balance += amount; 
		 System.out.println("Deposited: " + amount);
	 } 
	 else 
	 {
		 System.out.println("Invalid amount for deposit."); 
	 }
 }
 public void withdraw(double amount) 
 {
	 try {
		 if (amount > balance)
		 { 
			 throw new IllegalArgumentException("Withdrawal amount exceeds balance.");
		 }
		 else
		 {
			 balance -= amount; 
			 System.out.println("Withdrawn: " + amount);
		 }
	 	} 
	 catch (IllegalArgumentException e) 
	 { 
		 System.out.println("Error: " + e.getMessage()); 
	 }
 }
 public void displayBalance() 
 {
	 System.out.println("Current Balance: " + balance);
 }
}
public class Bank 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter initial balance: ");
		double initialBalance = scanner.nextDouble();
		BankAccount account = new BankAccount(initialBalance); 
		while (true) 
		{
			System.out.println("\nChoose an option:");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Display Balance");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt(); 
			switch (choice) 
			{
			case 1:
				System.out.print("Enter deposit amount: ");
				double depositAmount = scanner.nextDouble();
				account.deposit(depositAmount);
				break;
			case 2:
				System.out.print("Enter withdrawal amount: ");
				double withdrawAmount = scanner.nextDouble();
				account.withdraw(withdrawAmount);
				break;
			case 3:
				account.displayBalance(); 
				break;
			case 4:
					System.out.println("Exiting..."); 
					scanner.close();
					System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again."); 
			}
		}
	}
}
