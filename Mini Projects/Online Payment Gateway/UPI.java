public class UPI implements PaymentMethod {
   
    @Override
    public void authorize(double amount) {
        System.out.println("UPI authorized.");
    }

    @Override
    public void capture(double amount) {
        System.out.println("UPI payment successful: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("UPI refund: " + amount);
    }
}