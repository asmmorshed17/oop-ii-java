public class Main4 {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Morshed");
        Professor prof = new Professor("Nazmun Nahar");

        Assignment a1 = new Assignment("OOP Assignment");
        Grade g1 = new Grade();


        Course c1 = new OnlineCourse("Java Course");
        Course c2 = new OfflineCourse("Math Course");

        c1.submitAssignment(s1, a1);
        c2.submitAssignment(s1, a1);


        prof.assignGrade(g1, 90);


        System.out.println("Marks: " + g1.getMarks());
    }
}