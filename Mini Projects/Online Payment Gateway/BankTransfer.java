public class BankTransfer implements PaymentMethod {
    
    @Override
    public void authorize(double amount) {
        System.out.println("Bank transfer authorized.");
    }

    @Override
    public void capture(double amount) {
        System.out.println("Bank transfer completed: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Bank refund: " + amount);
    }
}