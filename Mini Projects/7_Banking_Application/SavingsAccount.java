class SavingsAccount extends Account {

    public SavingsAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    public void addInterest() throws NegativeAmountException {
        double interest = getBalance() * 0.05;

        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}