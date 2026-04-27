public class Main7 {
    public static void main(String[] args) {

        Account acc1 = new SavingsAccount(101, 1000);
        Account acc2 = new CurrentAccount(102, 500);

        Customer c1 = new Customer("Morshed", acc1);

        try {
            acc1.deposit(500);
            acc1.withdraw(200);

            acc1.transfer(acc2, 300);

            acc2.withdraw(100);

            ((SavingsAccount) acc1).addInterest();

        } catch (NegativeAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final Balance (Acc1): " + acc1.getBalance());
        System.out.println("Final Balance (Acc2): " + acc2.getBalance());
    }
}