class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit
    public void deposit(double amount) throws NegativeAmountException {
        if (amount <= 0) {
            throw new NegativeAmountException("Invalid deposit amount!");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw
    public void withdraw(double amount)
            throws NegativeAmountException, InsufficientFundsException {

        if (amount <= 0) {
            throw new NegativeAmountException("Invalid withdrawal amount!");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Not enough balance!");
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    // Transfer
    public void transfer(Account target, double amount)
            throws NegativeAmountException, InsufficientFundsException {

        if (target == null) {
            throw new IllegalArgumentException("Invalid target account!");
        }

        this.withdraw(amount);
        target.deposit(amount);

        System.out.println("Transferred: " + amount);
    }
}