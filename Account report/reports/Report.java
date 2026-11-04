package reports;
import transaction.Account;
public class Report {
    public void show(Account a) {
        System.out.println("Account No: " + a.accno);
        System.out.println("Balance: " + a.bal);
    }
}