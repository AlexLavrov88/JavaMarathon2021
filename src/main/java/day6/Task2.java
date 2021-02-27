package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Mig",2019,30,5);
        airplane.fillUp(70);
        airplane.fillUp(99);
        airplane.info();


    }
}
