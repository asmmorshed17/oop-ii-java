public class Doctor extends Person{
    String specialization ;

    Doctor(int id,String name,String specializatio){
        super(id, name);
        this.specialization = specialization;
    }
}
