package day7;

public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
}
