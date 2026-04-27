import java.util.*;
public class Order {
    private List<Product> items ;

    Order(List<Product>items){
        this.items = items;
    }

    
    public void generateInvoice(){
        double total = 0;
        
        System.out.println("------------------------------------------");
        System.out.println("Invoice: ");
        System.out.println("------------------------------------------");

        for(Product p: items){
            double price = p.priceAfterDiscount();
            System.out.println(p.getName() + " : "+price );

            total += price ;
        }

        System.out.println("Grand Total : "+total);
    }
}
