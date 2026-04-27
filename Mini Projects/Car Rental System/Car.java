public class Car extends Vehicle implements Rentable {

    public Car(int id, String name) {
        super(id, name);
    }

    @Override
    public double rent(int days) {

        if (days <= 0) return 0;

        //rent of Car (Per day) : 4000
        double rate = 4000;
        return rate * days;
    }
}