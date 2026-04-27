public interface PaymentMethod {

    void authorize(double amount) throws InvalidCardException;

    void capture(double amount) throws InsufficientBalanceException;

    void refund(double amount);
}