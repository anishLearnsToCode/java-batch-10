package day8;

public class AbstractRunner {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println(circle.area());
        System.out.println(circle.circumference());
        circle.grow(2);
        System.out.println(circle.area());

        Square square = new Square(2);
        square.grow(0);
        System.out.println(square.area());

        grow(square);
        grow(circle);

        System.out.println(circle.area());
    }

    // Dynamic Binding
    private static void grow(Shape shape) {
        shape.grow(10);
    }
}
