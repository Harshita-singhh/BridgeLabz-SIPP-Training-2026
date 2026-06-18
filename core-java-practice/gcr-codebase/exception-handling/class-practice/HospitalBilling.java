public class HospitalBilling {

    static void processPayment(double balance, double amount)
            throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException("Payment failed: Insufficient funds.");
        }

        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {

        int[] patients = {101, 102, 103};

        try {

            int totalBill = 1000;
            int items = 0;
            int averageCost = totalBill / items;

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of bill items cannot be zero.");
        }

        try {

            System.out.println(patients[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index.");
        }

        try {

            int amount = Integer.parseInt("abc");

        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input.");
        }

        try {

            processPayment(5000, 7000);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}