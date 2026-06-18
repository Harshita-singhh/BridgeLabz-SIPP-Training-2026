class InsufficientBalanceException extends Exception {

    private double balance;
    private double requestedAmount;

    public InsufficientBalanceException(double balance, double requestedAmount) {

        super("Balance = ₹" + balance +
                ", Requested = ₹" + requestedAmount);

        this.balance = balance;
        this.requestedAmount = requestedAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }
}