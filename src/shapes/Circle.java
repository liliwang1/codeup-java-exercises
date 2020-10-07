package shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI; // Math.pow(this.radius, 2) * Math.PI
    }

    public double getCircumference() {
        return radius * Math.PI * 2;
    }
}
