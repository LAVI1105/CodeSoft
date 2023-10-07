import java.util.Scanner;
class BankAccount {
private double balance;
public BankAccount(double initialBalance) {
this.balance = initialBalance;
}
public double getBalance() {
return balance;
}
public void deposit(double amount) {
if (amount > 0) {
balance += amount;
}
}
public boolean withdraw(double amount) {
if (amount > 0 && amount <= balance) {
balance -= amount;
return true;
} else {
return false; 
}
}
}
class ATM {
private BankAccount userAccount;
public ATM(BankAccount userAccount) {
this.userAccount = userAccount;
}
public void displayOptions() {
System.out.println("ATM Options:");
System.out.println("1. Withdraw");
System.out.println("2. Deposit");
System.out.println("3. Check Balance");
System.out.println("4. Exit");
}
public void run() {
Scanner scanner = new Scanner(System.in);
while (true) {
displayOptions();
System.out.print("Select an option (1/2/3/4): ");
int choice = scanner.nextInt();
switch (choice) {
case 1:
System.out.print("Enter the withdrawal amount: $");
double withdrawAmount = scanner.nextDouble();
boolean success = userAccount.withdraw(withdrawAmount);
if (success) {
System.out.println("Withdrawal successful.");
} else {
System.out.println("Withdrawal failed. Insufficient balance or invalid amount.");
}
break;
case 2:
System.out.print("Enter the deposit amount: $");
double depositAmount = scanner.nextDouble();
userAccount.deposit(depositAmount);
System.out.println("Deposit successful.");
break;
case 3:
System.out.println("Current Balance: $" + userAccount.getBalance());
break;
case 4:
System.out.println("Thank you for using the ATM. Goodbye!");
scanner.close();
return;
default:
System.out.println("Invalid choice. Please select a valid option.");
}
}
}
}
public class ATMSystem {
public static void main(String[] args) {
BankAccount userAccount = new BankAccount(1000.0); // Initial balance of $1000
ATM atm = new ATM(userAccount);
atm.run();
}
}
