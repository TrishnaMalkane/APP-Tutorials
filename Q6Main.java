
import accounts.Account;
import accounts.SavingsAccount;
import accounts.CurrentAccount;

public class Q6Main {
    public static void main(String[] args) {
        Account a;

        a = new SavingsAccount(101, 5000);
        a.displayDetails();

        a = new CurrentAccount(102, 10000);
        a.displayDetails();

        payments.UPIPayment upi = new payments.UPIPayment();
        upi.verifyPayment();

        payments.Payment p = upi;
        p.pay(2000);

        p = new payments.CardPayment();
        p.pay(3000);

        if (p instanceof payments.OnlineTransaction) {
            System.out.println("Online Transaction");
        }
    }
}
