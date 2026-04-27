import java.util.ArrayList;
import java.util.List;

public class HospitalManager {
    
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();
    List<Appointment> appointments = new ArrayList<>();

    

    void addDoctor(Doctor d){
        doctors.add(d);
    }


    void addPatient(Patient p){
        patients.add(p);
    }


    void bookAppointment(Doctor d,Patient p,String time) throws Exception{
        
        for(Appointment a:appointments){
            if(a.doctor==d && a.time.equals(time)){
                throw new Exception("Appointment slot already Booked!");
            }
        }

        appointments.add (new Appointment(d, p, time));
        System.out.println("Appointment Booked Successfully!");
    }
}
