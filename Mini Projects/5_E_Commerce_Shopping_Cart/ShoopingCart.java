import java.util.*;
public class ShoopingCart {
  
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product p) throws OutOfStockException{
        if(p.getStock()<=0){
            throw new OutOfStockException("Product out of Stock");
        }

        items.add(p);
        p.reduceStock();
        System.out.println(p.getName()+ " added to cart.");
    }

    public void removeProduct(Product p) throws InvalidProductException{
        if(!items.contains(p)){
            throw new InvalidProductException("Product not in Cart");
        }

        items.remove(p);
        p.increaseStock();
        System.out.println(p.getName()+ " removed from cart.");
    }

    public List<Product> getItems(){
        return items;
    }
}
