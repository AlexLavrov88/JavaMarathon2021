package day6;

public class Airplane {
    String producer;
    int year;
    int lenght;
    int weight;
    int fuel;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, int lenght, int weight) {
        this.producer = producer;
        this.year = year;
        this.lenght = lenght;
        this.weight = weight;
        this.fuel = 0;
    }

    public void fillUp(int n) {
        this.fuel = n;
    }

    public void info() {
        System.out.println("Изготовитель: " + this.producer +", год выпуска: " + this.year + ", длина: "+ this.lenght + ", вес: "+ this.weight + ", количество топлива в баке: " +this.fuel);
    }
}
