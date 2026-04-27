public class CreditCard implements PaymentMethod{

    private double balance;
    private String cardNumber;

    CreditCard(String cardNumber,double balance){
        this.cardNumber = cardNumber ;
        this.balance = balance;
    }

    @Override
    public void authorize(double amount) throws InvalidCardException{
        if(cardNumber.length()!=16){
            throw new InvalidCardException("Invalid Card Number!");
        }
        System.out.println("Card authorized.");
    }

    @Override
    public void capture(double amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("Not Enough Balance!");
        }
        balance-= amount;
        System.out.println("Payment Captured : "+amount);
    }

    @Override
    public void refund(double amount){
        balance += amount ;
        System.out.println("Refund sucessfull: "+amount);
    }
}