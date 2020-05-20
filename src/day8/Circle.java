package day8;

public class Circle extends Shape implements Morphable, MyComparable {
    double radius;

    Circle(int radius) {
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
}
