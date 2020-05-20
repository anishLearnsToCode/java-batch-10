package day8;

public class Square extends Shape {
    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    public void grow(int factor) {
        side *= factor;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }
}
