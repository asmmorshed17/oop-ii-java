public class Bike extends Vehicle implements Rentable{

    Bike(int id,String name){
        super(id,name);
    }

    @Override
    public double rent(int days){

        if(days<=0) return  0;

        //rent of Bike (Per day) : 1000
        double rate = 1000 ;
        return rate * days ;
    }
}
