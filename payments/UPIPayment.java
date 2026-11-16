
package payments;

public class UPIPayment implements SecurePayment, OnlineTransaction {
    public void verifyPayment() {
        System.out.println("UPI Payment Verified");
    }

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}
