
package accounts;

public class CurrentAccount extends Account {
    public CurrentAccount(int number, double balance) {
        super(number, balance);
    }

    public void displayDetails() {
        System.out.println("Current Account");
        super.displayDetails();
    }
}
