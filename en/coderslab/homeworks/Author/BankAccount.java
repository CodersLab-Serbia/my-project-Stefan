// Exercise 4
//
//Create a `BankAccount` class that meets the following requirements:
//
//1. It has private attributes:
//* `number` - this attribute should hold the account ID (for simplicity you can assume that the account number can be any integer),
//* `cash` - this attribute indicates the amount of money in the account. It should be a floating-point number. The `cash` attribute should always be set to 0 for a newly created account.
//
//2. It has getters for the attributes `number` and `cash`, but does NOT have setters for them (we don't want a once created account to be able to change its number, and to the attribute `cash` we will add special functions to modify its value).
//
//3. It has a `void depositCash(amount)` method whose role will be to increase the value of the `cash` attribute by the given value. Remember to check if the given value is:
//* Greater than 0
//
//4. It has a `double withdrawCash(amount)` method whose role will be to decrease the value of the `cash` attribute by the given value.
//   This method should return the amount of money withdrawn. For simplicity, assume that the amount of money in the account must not go below 0, e.g. if you try to withdraw USD 500 from an account where there is USD 300, the method will only return USD 300.
//   Remember to check if the given value is:
//    * Greater than 0
//
//5. It has a `String toString()` method with no parameters. This method should return information about the account number and its balance.

package en.coderslab.homeworks.Author;


public class BankAccount {
    // Private attributes
    private int number;      // Account ID
    private double cash;     // Amount of money in the account

    // Constructor
    public BankAccount(int number) {
        this.number = number; // Set the account number
        this.cash = 0.0;      // Cash is initialized to 0
    }

    // Getter for account number
    public int getNumber() {
        return number;
    }

    // Getter for cash amount
    public double getCash() {
        return cash;
    }

    // Method to deposit cash
    public void depositCash(double amount) {
        if (amount > 0) {
            cash += amount; // Increase cash by the given amount
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    // Method to withdraw cash
    public double withdrawCash(double amount) {
        if (amount > 0) {
            if (amount <= cash) {
                cash -= amount; // Decrease cash by the given amount
                return amount;   // Return the withdrawn amount
            } else {
                double withdrawnAmount = cash; // Withdraw only available cash
                cash = 0; // Set cash to 0
                return withdrawnAmount; // Return the withdrawn amount
            }
        } else {
            System.out.println("Withdrawal amount must be greater than 0.");
            return 0; // Return 0 if the amount is invalid
        }
    }

    // toString method to return account information
    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + number +
                ", cash=" + cash +
                '}';
    }
}