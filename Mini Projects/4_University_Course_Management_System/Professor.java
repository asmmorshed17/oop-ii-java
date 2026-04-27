class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }


    public void assignGrade(Grade g, int marks) {
        g.setMarks(marks);
        System.out.println("Grade assigned by Prof. " + name);
    }
}