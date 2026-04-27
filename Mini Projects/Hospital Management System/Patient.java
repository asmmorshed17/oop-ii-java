public class Patient extends Person {
    private String medicalHistory;

    Patient(int id,String name){
        super(id, name);   
    }

    public void setMedicalHistory(String history){

        this.medicalHistory = medicalHistory;
    }

    public String getMedicalHistory(){

        return medicalHistory ;
    }
}
