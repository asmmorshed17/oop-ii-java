public class RentalAgreement {
    private Rentable vehicle;
    private int days;
    private boolean insurance ;

    RentalAgreement(Rentable vehicle,int days,boolean insurance){
        this.vehicle = vehicle;
        this.days = days;
        this.insurance = insurance;
    }

    public void generateBill(){
        double total = vehicle.rent(days);

        if(insurance){
            total+= 20*days;
        }
        System.out.println("---------------------");

        Vehicle v = (Vehicle) vehicle;

        System.out.println("Vehicle : "+v.getName());
        System.out.println("Insurance: "+(insurance? "Yes" : "No"));
        System.out.println("Total Cost : "+total);
    }
}
