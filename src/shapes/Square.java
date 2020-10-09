package shapes;

public class Square extends Quadrilateral {
    public Square(double length, double width) {
        super(length, width);
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
        return length * 4;
    }

    @Override
    public double getArea() {
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
