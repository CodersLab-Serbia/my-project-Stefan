package en.coderslab.homeworks.Author;

public class Main {
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account = new BankAccount(12345);

        // Deposit some cash
        account.depositCash(500);
        System.out.println(account); // Should show cash as 500

        // Withdraw some cash
        double withdrawn = account.withdrawCash(200);
        System.out.println("Withdrawn: " + withdrawn); // Should show 200
        System.out.println(account); // Should show cash as 300

        // Attempt to withdraw more than available
        withdrawn = account.withdrawCash(400);
        System.out.println("Withdrawn: " + withdrawn); // Should show 300
        System.out.println(account); // Should show cash as 0
    }
}