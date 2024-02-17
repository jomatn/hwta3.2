public class BankAccount {
    private double amount;

    public BankAccount(double initialAmount) {
        this.amount = initialAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public void withDraw(double sum) throws LimitException {
        try {
            if (sum > amount) {
                throw new LimitException("Requested amount exceeds the available balance. Balance: " + amount, amount);
            }
            amount -= sum;
        } catch (LimitException e) {
            double withdrawnAmount = amount;
            amount = 0;
            throw new LimitException("The balance was withdrawn: " + withdrawnAmount, withdrawnAmount);
        }
    }

}
