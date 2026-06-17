public class BankDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(10000);

        try {

            account.withdraw(2000);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println("Invalid amount!");
        }
    }
}