package shapes;

public class Square extends Rectangle {
    public double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea() {
        System.out.print("Square method  ");
        return Math.pow(side, 2); // this.length * this.width // super.length * super.width
    }

    @Override
    public double getPerimeter() {
        System.out.print("Square method  ");
        return side * 4; // this.length * 4 // super.length * 4
    }

    public void sayHi() {
        System.out.println("hi " + side);
    }
}
