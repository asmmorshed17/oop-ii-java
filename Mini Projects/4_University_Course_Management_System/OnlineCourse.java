class OnlineCourse extends Course {

    public OnlineCourse(String name) {
        super(name);
    }

    @Override
    public void submitAssignment(Student s, Assignment a) {
        System.out.println("Online submission by " + s.getName());
    }
}