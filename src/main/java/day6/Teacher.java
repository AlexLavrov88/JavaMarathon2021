package day6;

import java.util.Random;

public class Teacher {


    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        String eval = null;
        int a = 2;
        int b = 5;
        int x  =  a +  random.nextInt(b - a + 1);
        if (x == 2) eval = "неудовлетворительно";
        if (x == 3) eval = "удовлетворительно";
        if (x == 4) eval = "хорошо";
        if (x == 5) eval = "отлично";


        System.out.println("Преподаватель " + this.name +" оценил студента с именем " + student.getName() +  " по предмету " + this.subject + " на оценку "+ eval);

    }
}
