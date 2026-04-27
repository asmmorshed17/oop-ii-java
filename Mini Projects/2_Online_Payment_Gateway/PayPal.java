public class PayPal implements PaymentMethod {
    private double balance ;

    PayPal(double balance){
        this.balance = balance ;
    }

    @Override
    public void authorize(double amount){
        System.out.println("PayPal Authorized.");
    }

    @Override
    public void capture(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient PayPal balance!");
        }
        balance -= amount;
        System.out.println("PayPal payment done: " + amount);
    }

    @Override
    public void refund(double amount) {
        balance += amount;
        System.out.println("Refund via PayPal: " + amount);
    }
}
