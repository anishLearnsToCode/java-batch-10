package day5;

import java.util.Scanner;

public class RandomNumberGenerator {
    /*
    User enters number N (int)
    Output random value (int) between [0, N)

    e.g. N = 100
    so [0, 100) --> 9, 10, 78, 99, 0, 4 etc...
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        System.out.println(random(number));
        System.out.println(random(number));
        System.out.println(random(number));
        System.out.println(random(number));
        System.out.println(random(number));
        System.out.println(random(number));
        System.out.println(random(number));
    }

    private static int random(int number) {
        double random = Math.random(); // [0, 1)
        return (int) (random  * number);
    }
}
