public class Main {
    public static void main(String[] args) {
        
        HospitalManager hm = new HospitalManager();

        Doctor d1 = new Doctor(101, "Dr. Ashiq Junayed", "Cardiology");
        Patient p1 = new Patient(001, "Rifat" );

        hm.addDoctor(d1);
        hm.addPatient(p1);

        try{
            hm.bookAppointment(d1, p1, "10AM");
            hm.bookAppointment(d1, p1, "10AM");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
