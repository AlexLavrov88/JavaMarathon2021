package day9.Task2;

public class Rectangle extends Figure {
    double wight;
    double height;

    public Rectangle( double wight, double height, String color) {
        super(color);
        this.wight = wight;
        this.height = height;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public Rectangle(String color) {
        super(color);
    }

    @Override
    public double area() {
        double s = this.height * this.wight;
        return s;
    }

    @Override
    public double perimeter() {
        double p = 2 * (this.height + this.wight);
        return p;
    }
}
