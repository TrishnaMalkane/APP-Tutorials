
class BankAccount {
    int accountNo;
    String name;
    private double balance;

    BankAccount(int no, String n, double b) {
        accountNo = no;
        name = n;
        balance = b;
    }

    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Invalid withdrawal");
    }

    void display() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class q1_bankAccount {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(101, "Rahul", 5000);

        b.deposit(2000);
        b.withdraw(1000);
        b.display();
    }
}
