package day5;

import java.util.Scanner;

public class Hypotenuse {
    /*
    User input : a, b
    Output : c
    c = sqrt(a^2 + b^2)
     */

    public static void main(String[] args) {
//        System.out.println(Math.max(10, 2));
//
//        System.out.println(Math.max(10, 198.45));
//
//        System.out.println(Math.min(-10, -40));
//
//        System.out.println(Math.E);
//        System.out.println(Math.PI);
//
//        System.out.println(Math.sqrt(16));
//
//        System.out.println(2^3);

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        scanner.close();

        System.out.println(hypotenuse(a, b));
    }

    private static double hypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }
}
