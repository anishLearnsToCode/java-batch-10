package day10;

import day8.Circle;
import day8.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraysRefresher {
    public static void main(String[] args) {
        int[] a;
        long[] l;
        double[] d;
        String[] strings = {"hello", "world"};

//        System.out.println(strings[0]);
//        System.out.println(strings[1]);

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(10));
        circles.add(new Circle(1));
        circles.add(new Circle(1));

        // f : int (index) ---> T
        // f : K (Key) ----> V (Value)

        Map<String, Integer> frequencies = new HashMap<>();
        frequencies.put("hello", 4);
        frequencies.put("i", 100);
        frequencies.put("a", 200);
//        System.out.println(frequencies);

        frequencies.put("a", 150);
//        System.out.println(frequencies);

        frequencies.put("am", 4);

        /*
            Keys ----> Values
            hello       4
            i           100
            a           150
            a
         */

        /*
        hashcode
        x == y equals()
        x hashcode same y hashcode
        x =3 y =3
        x.hashcode == y.hashcode

         */

        Integer integer = 20;
//        System.out.println(integer.hashCode());

        String hello = new String("hello");
        String h = new String("hello");
//        System.out.println(hello == h);
//        System.out.println(hello.equals(h));

//        System.out.println(hello.hashCode());
//        System.out.println(h.hashCode());

        Circle circle = new Circle(10);
        Circle circle1 = new Circle(10);

//        System.out.println(circle == circle1);
//        System.out.println(circle.equals(circle1));
//        System.out.println(circle1.equals(circle));

//        System.out.println(circle.hashCode());
//        System.out.println(circle1.hashCode());

        Circle other = new Circle(7);
        System.out.println(circle.equals(other));

        System.out.println(circle.hashCode() == other.hashCode());

        Circle circle2 = new Circle(10.5);
        System.out.println(circle.hashCode());
        System.out.println(circle1.hashCode());

        Student student = new Student(10, 10);
        Student student2 = new Student(10, 5);
        System.out.println(student.equals(student2));

        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());


    }
}
