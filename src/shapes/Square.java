package shapes;

public class Square extends Rectangle {
    public double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getArea() {
        System.out.print("Square method  ");
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
        System.out.print("Square method  ");
        return side * 4;
    }

    public void sayHi() {
        System.out.println("hi " + side);
    }
}
