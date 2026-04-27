public class Electronics extends Product{
   
    Electronics(int id,String name,double price,int stock){
        super(id,name,price,stock);
    }
    
    @Override
    public double priceAfterDiscount(){
        return price* 0.9; //if discount(Electronics) = 10%
    }


}
