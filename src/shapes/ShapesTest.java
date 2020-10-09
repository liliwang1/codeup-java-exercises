package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5, 2);
        Measurable myShape1 = new Square(3, 3);
        Rectangle rect1 = new Rectangle(6, 7);
        Quadrilateral rect2 = new Rectangle(3,2);
        Square squ1 = new Square(2.5, 2.5);
        Square squ2 = new MiniSquare(2, 2);
        MiniSquare squ3 = new MiniSquare(1, 1);
        Quadrilateral squ4 = new MiniSquare(0.5, 0.5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());
        System.out.println(rect1.getArea());
        System.out.println(rect1.getPerimeter());
        System.out.println(rect2.getArea());
        System.out.println(rect2.getPerimeter());
//        myShape.getLength(); // error
        System.out.println(((Rectangle) myShape).getLength());
        System.out.println(((Quadrilateral) myShape).getLength());
//        System.out.println(((Square) myShape).getLength()); // ClassCastException
//        myShape1.getLength(); // error
//        myShape.sayHi(); // error
        ((Rectangle) myShape).sayHi();
//        ((Quadrilateral) myShape).sayHi(); // error
//        myShape1.sayHi(); // error
        System.out.println(rect1.getLength());
        rect1.sayHi();
        System.out.println(rect2.getLength());
//        rect2.sayHi(); // error, needs casting

        System.out.println(squ1.getArea());
        System.out.println(squ1.getPerimeter());
        System.out.println(squ2.getArea());
        System.out.println(squ2.getPerimeter());
        System.out.println(squ3.getArea());
        System.out.println(squ3.getPerimeter());
        System.out.println(squ4.getArea());
        System.out.println(squ4.getPerimeter());
        System.out.println(squ1.getLength());
        squ1.sayHi();
        System.out.println(squ2.getLength());
        squ2.sayHi();
        System.out.println(squ3.getLength());
        squ3.sayHi();
        System.out.println(squ4.getLength());
//        squ4.sayHi(); // error, need casting
        ((Square) squ4).sayHi();
        ((MiniSquare) squ4).sayHi();


//        Rectangle box1 = new Rectangle(5, 4);
//
//        System.out.println(box1.getArea()); // 20.0
//        System.out.println(box1.getPerimeter()); // 18.0
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println(box2.getArea()); // 25.0 // after method overriding, will run Square class's method
//        System.out.println(box2.getPerimeter()); // 20.0
//        System.out.println(box2.length); // 5.0
//        System.out.println(box2.width); // 5.0
//        System.out.println(((Square) box2).side); // 0.0
//        ((Square) box2).sayHi(); // if a field is not an overriding method(not inside the superclass), can not be accessed unless casted(unique to subclass? access through casting)
//
//
//        Rectangle[] group = new Rectangle[2];
//        group[0] = new Rectangle(6, 7);
//        group[1] = new Square(6);
//        for (Rectangle rect : group) {
//            System.out.println("rect.getArea() = " + rect.getArea());
//            System.out.println("rect.getPerimeter() = " + rect.getPerimeter());
//        }
//
//
//        System.out.println();
//        Rectangle box3 = new MiniSquare(2);
//        System.out.println(box3.getArea());
//        ((Square) box3).sayHi();
//        ((MiniSquare) box3).sayHi();
//        System.out.println(((MiniSquare) box3).side);
//        System.out.println(box3.width);
//        System.out.println(box3.length);
//        System.out.println();
//
//        Square box4 = new MiniSquare(1);
//        System.out.println(box4.width);
//        System.out.println(box4.side);
//        System.out.println(box4.getArea());
//        box4.sayHi();
//        ((MiniSquare) box4).miniHi();
    }
}
