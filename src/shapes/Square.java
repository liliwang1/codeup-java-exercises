package shapes;

public class Square extends Quadrilateral /* implements Measurable */ {
    // Quadrilateral will carry the abstract methods from Measurable with it since it has implemented Measurable, but does not need to define the body of methods because Quadrilateral itself is an abstract class, but its non-abstract subclasses need to define the methods body, and no need to add /* implements Measurable */ on this line since the methods are already carried with Quadrilateral

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        System.out.println("I'm Square");
        return length * 4;
    }

    @Override
    public double getArea() {
        System.out.println("I'm Square");
        return length * width;
    }

    public void sayHi() {
        System.out.println("hi,i'm Square");
    }

    //    public double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public double getArea() {
//        System.out.print("Square method  ");
//        return Math.pow(side, 2); // this.length * this.width // super.length * super.width
//    }
//
//    @Override
//    public double getPerimeter() {
//        System.out.print("Square method  ");
//        return side * 4; // this.length * 4 // super.length * 4
//    }
//
//    public void sayHi() {
//        System.out.println("hi " + side);
//    }
}
