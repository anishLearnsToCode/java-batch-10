package day7;

public class Constructors {
    public static void main(String[] args) {
//        Student abc = new Student("bill", "gates");
//        abc.fullName();
//        System.out.println(abc.rollNo);

        Student elon = new Student();
        Student bill = new Student("bill", "gates");
        Student ab = new Student(100);
        Student tesla = new Student("nikola", "tesla", 12);

        Point point = new Point(4, 3);
        System.out.println(point.distanceFromOrigin());
    }
}

