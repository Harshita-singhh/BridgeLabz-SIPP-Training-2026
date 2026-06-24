public class main {
    public static void main(String[] args) {

        // Create 3 accounts
        bankacc acc1 = new bankacc(101, "Harshita", 10000);
        bankacc acc2 = new bankacc(102, "Rahul", 8000);
        bankacc acc3 = new bankacc(103, "Priya", 12000);

        // 5 transactions for Account 1
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.deposit(1000);
        acc1.withdraw(500);
        acc1.withdraw(3000);

        // 5 transactions for Account 2
        acc2.deposit(500);
        acc2.withdraw(1000);
        acc2.deposit(2500);
        acc2.withdraw(2000);
        acc2.withdraw(10000);

        // 5 transactions for Account 3
        acc3.deposit(3000);
        acc3.withdraw(2500);
        acc3.deposit(1000);
        acc3.withdraw(4000);
        acc3.deposit(500);

        // Display statements
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        // Display total accounts created
        bankacc.displayTotalAccounts();
    }
}