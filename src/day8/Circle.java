package day8;

import java.util.Objects;

public class Circle extends Shape implements Morphable, MyComparable {
    public double radius;
    public int random = (int) (Math.random() * 100);

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void grow(int factor) {
        this.radius *= factor;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void shrink(int factor) {
        radius *= factor;
    }

    @Override
    public void shear(int factor) {
        radius *= (double) factor / 10;
    }

    @Override
    public void enlarge(int factor) {
        radius *= Math.pow(factor, 2);
    }

    @Override
    public int compare(Object object) {
        if (object == this) return 0;
        if (object.getClass() == this.getClass()) {
            Circle other = (Circle) object;
            if (this.radius > other.radius) {
                return 1;
            } else if (this.radius < other.radius) {
                return -1;
            } else {
                return 0;
            }
        }
        return -1;
    }

    @Override
    // depend on same variable as hashcode:
    public boolean equals(Object object) {
        if (this == object) return true;

        if (object instanceof Circle) {
            Circle other = (Circle) object;
            return this.radius == other.radius;
        }

        return false;
    }

    // f(radius) = radius * radius
    // f(x, y) = x + y
    // depends on: radius
//    public int hashCode() {
//        return (int) (radius + random);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
//        return 0;
    }
}
