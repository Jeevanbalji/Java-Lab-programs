import transaction.Account;
import reports.Report;

class Main {
    public static void main(String[] args) {

        Account a = new Account(101, 50000);

        a.deposit(2000);
        a.withdraw(5000);

        Report r = new Report();
        r.show(a);
    }
}