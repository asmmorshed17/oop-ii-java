public class Main2 {
    public static void main(String[] args) {
        try {
            PaymentMethod payment;


            payment = new CreditCard("1234567890123456", 5000);

            payment.authorize(1000);
            payment.capture(1000);
            payment.refund(200);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}