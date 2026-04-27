public class Grocery extends Product {
    Grocery(int id, String name, double price, int stock) {
        super(id, name, price, stock);
    }

    @Override
    public double priceAfterDiscount() {
        return price * 0.95; //Discount(Grocery): 5%
    }
}