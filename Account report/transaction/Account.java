package transaction;

public class Account {
    public int accno;
    public int bal;

    public Account(int n, int b) {
        accno = n;
        bal = b;
    }

    public void deposit(int amt) {
        bal = bal + amt;
        System.out.println("Deposited: " + amt);
    }

    public void withdraw(int amt) {
        if (amt <= bal) {
            bal = bal - amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Low Balance");
        }
    }
}