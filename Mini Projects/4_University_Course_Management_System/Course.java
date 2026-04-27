class Course {
    protected String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }


    public void submitAssignment(Student s, Assignment a) {
        System.out.println("Assignment submitted for course: " + courseName);
    }
}