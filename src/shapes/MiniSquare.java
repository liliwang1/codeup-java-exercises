package shapes;

public class MiniSquare extends Square {
    public MiniSquare(double side) {
        super(side);
    }

    @Override
    public double getPerimeter() {
        System.out.println("I'm MiniSquare");
        return length * 4;
    }

    @Override
    public double getArea() {
        System.out.println("I'm MiniSquare");
        return length * width;
    }

//    public MiniSquare(double side) {
//        super(side);
//    }
//
//    public void miniHi() {
//        System.out.println("hi from miniSquare");
//    }
}
