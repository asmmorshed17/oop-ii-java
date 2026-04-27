public class Clothing extends Product {
    Clothing(int id, String name, double price, int stock) {
        super(id, name, price, stock);
    }

    @Override
    public double priceAfterDiscount() {
        return price * 0.8; //discount(Clothing) : 20%
    }
}