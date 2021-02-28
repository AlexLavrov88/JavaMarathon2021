package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Mig", 2015, 25, 5);
        Airplane airplane1 = new Airplane("Boeing", 2008, 150, 10);
        Airplane.compareAirplanes(airplane, airplane1);
    }
}