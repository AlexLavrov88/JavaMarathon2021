package day9.Task2;

public class Triangle extends Figure {
    double lenghtA;
    double lenghtB;
    double lenghtC;

    public Triangle( double lenghtA, double lenghtB, double lenghtC, String color) {
        super(color);
        this.lenghtA = lenghtA;
        this.lenghtB = lenghtB;
        this.lenghtC = lenghtC;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public Triangle(String color) {
        super(color);
    }

    @Override
    public double area() {
        double p = (this.lenghtA + this.lenghtB + this.lenghtC) / 2;
        double s = Math.sqrt(p * ((p - this.lenghtA) * (p - this.lenghtB) * (p - this.lenghtC)));
        return s;
    }

    @Override
    public double perimeter() {
        double p = this.lenghtA + this.lenghtB + this.lenghtC;
        return p;
    }
}
