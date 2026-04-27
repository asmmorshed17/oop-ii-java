public class Product {

    protected int id ;
    protected String name ;
    protected double price ;
    private int stock ;

    Product(int id,String name,double price,int stock){
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public double priceAfterDiscount(){
        return price;
    }

    public int getStock(){
        return stock;
    }

    public void reduceStock(){
        stock--;
    }

    public void increaseStock(){
        stock++;
    }

    public String getName(){
        return name ;
    }
    
}