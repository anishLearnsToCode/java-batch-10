package day9;

public class Circle implements Comparable<Circle> {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(other.radius, this.radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
