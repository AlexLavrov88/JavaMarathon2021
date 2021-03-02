package day9.Task1;

import java.sql.SQLOutput;

public class Student extends Human {
    String groupName;

    public String getGroupName() {
        return groupName;
    }

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Student(String name) {
        super(name);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + this.name);
    }
}
