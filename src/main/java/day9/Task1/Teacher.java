package day9.Task1;

public class Teacher extends Human {
    String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + super.name);
    }

    public String getSubjectName() {
        return subjectName;

    }
}
