package day8;

public class InterfaceRunnable {
    public static void main(String[] args) {
        Morphable morphable = new Circle(10);
        Shape shape = new Circle(1);
        Circle circle = new Circle(2);
    }

    private static void shear30(Morphable morphable) {
        morphable.shear(30);
    }

    private static int compare(MyComparable o1, MyComparable o2) {
        return o1.compare(o2);
    }
}
