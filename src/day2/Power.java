package day2;

import java.util.Scanner;

public class Power {
    // Time Complexity: O(power)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int power = scanner.nextInt();
        int result = 1;

        // output: base ^ power
        // base = 2, power = 3 --> 2^3 = 2 * 2 * 2 = 8
        // base = 5, power = 1 ---> 5^1 = 5
        // base = 2, power = 10  --> 2^10 = 2 * 2 * 2 * 2 *2 * 2 * 2 *2 * 2 * 2 = 1024

        // Time complexity: O(power)
        for (int i = 1 ; i <= power ; i++) {
            result *= base; // --> result = result * base
        }

        System.out.println(result);
    }
}
