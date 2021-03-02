package day9.Task2;

public class Circle extends Figure {
    double radius;
    @Override
    public String getColor() {
        return super.getColor();
    }

    public Circle(String color) {
        super(color);
    }

    public Circle( double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        double s = Math.PI * (this.radius * this.radius);
        return s;
    }

    @Override
    public double perimeter() {
        double p = 2 * (Math.PI * this.radius);
        return p;
    }
}
