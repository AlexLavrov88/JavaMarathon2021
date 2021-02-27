package day6;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(String model, String color, int year) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        int year = inputYear - this.year;
        if (year < 0) {
            year = year * -1;
        }
        return year;
    }
}
