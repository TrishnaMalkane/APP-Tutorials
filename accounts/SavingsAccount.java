
package accounts;

public class SavingsAccount extends Account {
    public SavingsAccount(int number, double balance) {
        super(number, balance);
    }

    public void displayDetails() {
        System.out.println("Savings Account");
        super.displayDetails();
    }
}
