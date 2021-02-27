package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2012);
        Motorbike motorbike = new Motorbike("Honda","red",2015);
        car.info();
        motorbike.info();
        System.out.println(car.yearDifference(2000));
        System.out.println(motorbike.yearDifference(1999));


    }
}
