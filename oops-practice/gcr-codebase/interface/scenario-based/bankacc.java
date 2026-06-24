//Design a simple BankAccount class that models real-world banking behavior. 
//Each account should store basic details like account number, holder name, and balance.
//You will implement methods to deposit and withdraw money, ensuring that withdrawals don't exceed the available balance. 
//The class should also keep track of how many accounts have been created using a static variable.
//Finally, create multiple accounts and simulate transactions to observe how the system behaves.

//Key Points
//Create a class with accountNumber, holder, and balance.
//Implement deposit() and withdraw() with proper balance checks.
//Add getStatement() to display account details.
//Use a static variable to count total accounts created.
//Create 3 accounts and perform 5 transactions on each.


class bankacc {
    private int accountNumber;
    private String holder;
    private double balance;

    // Static variable to count accounts
    private static int totalAccounts = 0;

    // Constructor
    public bankacc(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holder + " deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(holder + " withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance for " + holder);
        }
    }

    // Display account details
    public void getStatement() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Holder Name: " + holder);
        System.out.println("Balance: $" + balance);
    }

    // Static method to display total accounts
    public static void displayTotalAccounts() {
        System.out.println("\nTotal Accounts Created: " + totalAccounts);
    }
}