public class ATMSystem {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        System.out.println("Withdrawal successful.");
    }

    public static void main(String[] args) {

        try {

            withdraw(5000, 8000);

        } catch (InsufficientBalanceException e) {

            System.out.println("Insufficient balance.");
            System.out.println("Available balance: ₹" + e.getBalance());
            System.out.println("Requested amount: ₹" + e.getRequestedAmount());
        }
    }
}