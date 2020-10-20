package shapes;

public class Rectangle extends Quadrilateral /* implements Measurable */ {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }
    // note: all methods in an interface is public
    // Omitting "public" here is an error by Java: Cannot reduce the visibility of the inherited method from EmployeeActions
    // same thing applies to any methods inherited from superClass, cannot reduce visibility
    @Override
    public double getArea() {
        return length * width;
    }

    public void sayHi() {
        System.out.println("hi,i'm Rectangle");
    }
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//        return length * width;
//    }
//
//    public double getPerimeter() {
//        return (length + width) * 2;
//    }
}
