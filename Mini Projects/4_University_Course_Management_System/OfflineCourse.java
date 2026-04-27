class OfflineCourse extends Course {

    public OfflineCourse(String name) {
        super(name);
    }

    @Override
    public void submitAssignment(Student s, Assignment a) {
        System.out.println("Offline submission by " + s.getName());
    }
}