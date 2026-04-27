public class Main6 {
    public static void main(String[] args) {

        Rentable v1 = new Car(1, "Toyota");
        Rentable v2 = new Bike(2, "Yamaha");
        Rentable v3 = new Truck(3, "Volvo");

        RentalAgreement r1 = new RentalAgreement(v1, 3, true);
        RentalAgreement r2 = new RentalAgreement(v2, 2, false);
        RentalAgreement r3 = new RentalAgreement(v3, 5, true);

        r1.generateBill();
        r2.generateBill();
        r3.generateBill();
    }
}