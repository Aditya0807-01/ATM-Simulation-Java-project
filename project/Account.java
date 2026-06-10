public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Amount must be greater than 0.");
        }

        if (amount > balance) {
            throw new Exception("Insufficient balance.");
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}