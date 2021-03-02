package day9.Task1;

public class Human {
    String name;
    public String getName() {
        return name;
    }

    public Human(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем "+  this.name);
    }


}
