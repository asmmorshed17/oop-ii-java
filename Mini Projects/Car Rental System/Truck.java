public class Truck extends Vehicle implements Rentable{

    Truck(int id,String name){
        super(id,name);
    }

    @Override
    public double rent(int days){

        if(days<=0) return  0;

        //rent of Truck (Per day) : 2700
        double rate = 2700 ;
        return rate * days;
    }
}
