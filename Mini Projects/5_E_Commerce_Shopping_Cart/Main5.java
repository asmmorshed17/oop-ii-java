public class Main5 {
 public static void main(String[] args) {
    
    User user  = new User("Morshed");

    Product p1 = new Electronics(1, "Laptop", 1000, 2);
    Product p2 = new Clothing(2, "Shirt", 50, 1);
    Product p3 = new Grocery(3, "Rice", 30, 0);

    try{
        user.cart.addProduct(p1);
        user.cart.addProduct(p2);
        user.cart.addProduct(p3);

        user.cart.removeProduct(p3);
    }
    catch(OutOfStockException | InvalidProductException e){
        System.out.println(e.getMessage());
    }

    Order order = new Order(user.cart.getItems());
    order.generateInvoice();
 }   
}
