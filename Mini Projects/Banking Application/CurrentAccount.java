class CurrentAccount extends Account {

    public CurrentAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void withdraw(double amount)
            throws NegativeAmountException, InsufficientFundsException {

        double fee = 10;

        super.withdraw(amount + fee);
        System.out.println("Transaction fee: " + fee);
    }
}