
package accounts;

public class Account {
    protected int accountNumber;
    protected double balance;

    public Account(int number, double balance) {
        accountNumber = number;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
