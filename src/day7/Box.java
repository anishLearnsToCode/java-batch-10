package day7;

// Immutable
public class Box {
    private final double length;
    private final double width;
    private final double height;
    private final double volume;
    private final double surfaceArea;

    static {

    }

    // Cube Constructor
    private Box(double side) {
        length = width = height = side;
        volume = side * side * side;
        surfaceArea = 6 * side * side;
    }

    // Cuboid Constructor
    private Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        volume = length * width * height;
        surfaceArea = 2 * (length * width + width * height + height * length);
    }

    // Factory Method
    public static Box createCube(double side) {
        return new Box(side);
    }

    // Factory Method
    public static Box createCuboid(double length, double width, double height) {
        return new Box(length, width, height);
    }

    double length() {
        return length;
    }

    double width() {
        return width;
    }

    double height() {
        return height;
    }

    double volume() {
        return volume;
    }

    double surfaceArea() {
        return surfaceArea;
    }
}
