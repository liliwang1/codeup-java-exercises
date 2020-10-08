package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);

        System.out.println(box1.getArea()); // 20.0
        System.out.println(box1.getPerimeter()); // 18.0

        Rectangle box2 = new Square(5);

        System.out.println(box2.getArea()); // 25.0 // after method overriding, will run Square class's method
        System.out.println(box2.getPerimeter()); // 20.0
        System.out.println(box2.length); // 5.0
        System.out.println(box2.width); // 5.0
        System.out.println(((Square) box2).side); // 0.0
        ((Square) box2).sayHi(); // if a field is not an overriding method(not inside the superclass), can not be accessed unless casted(unique to subclass? access through casting)


        System.out.println();
        Rectangle box3 = new MiniSquare(2);
        System.out.println(box3.getArea());
        ((Square) box3).sayHi();
        ((MiniSquare) box3).sayHi();
        System.out.println(((MiniSquare) box3).side);
        System.out.println(box3.width);
        System.out.println(box3.length);
        System.out.println();

        Square box4 = new MiniSquare(1);
        System.out.println(box4.width);
        System.out.println(box4.side);
        System.out.println(box4.getArea());
        box4.sayHi();
        ((MiniSquare) box4).miniHi();
    }
}
