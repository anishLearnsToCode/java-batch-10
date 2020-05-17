package day1;

public class Arithmetic {
    public static void main(String[] args) {
        // O(1) = 24 O(1)
        int x = 10; //o1;
        int y = 1;  // o2
        int zero = 0;  //o3
        double d = y / x;

        // modulo operator (remainder)
        // System.out.println(0 % 2); // x / y ---> remainder
        // 0 = 3*a  + 0 (remainder) (a = 0)
        // 1 = 3*a + 1 (a = 0) (0, 1, 2)
        // 9, 7, 5, 3, 1 9 = 2*4 + 1

        // System.out.println(5 - 3 * (5 / 3));
        // a % b = a - b * (a / b)

        // Increment and decrement (Unary)
        // increnent - ++
        // pre-fix increment
        // ++x; // --> x = x + 1;

        // x++; postfix operator

        // System.out.println(y + y++ + ++y + y++);
        // 1 + 1 (2) + (3) 3 + 3 (4)
        // System.out.println(y);
        // 4

        // System.out.println(x + x++ + ++x);
        // 10 + 10 (11) + 12 (12) = 32

        // Decrement Operator (--)
        // x-- --> x = x - 1
        // --x; and x--;

        int a = 5;
        System.out.println(a--);
        System.out.println(a); //a = 4

        System.out.println(a + a-- + ++a);
        // 4 + 4 (3) + (4) 4 = 12

        // Using infinity in java
        int infinity = Integer.MAX_VALUE;
        int minimum = Integer.MIN_VALUE;
        long inf = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;

        System.out.println((a + 2) / (10 / 2));

        // 1 / 10.0
        // 1.0 / 10.0
        // 0.1
        // print

        // 10.0 * 1 + 0
        // 10.0 * 1.0 + 0
        // 10.0 + 0
        // 10.0 + 0.0
        // 10.0

        // if (x > y) {
        //     System.out.println(x);
        // } else {
        //     System.out.println(y);
        // }
    }
}
