package day4;

import java.util.Scanner;

public class TimeComplexity {
    /*
    k
    ln(lnx)
    ln(x)
    x
    x^2
    x^3
    x^4
    .
    .
    .
    x^1000

    a^x (a =2, 3, e, 6, .....)  --> Exponential Growth
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        // number = 2 --> 2
        // number = 4 --> 4, 2
        // number = 5 --> 5, 2
        // number = 10 --> 10, 5, 2
        // number = 8 --> 8, 4, 2
        // number = 16 --> 16, 8, 4, 2
        // number = 512 --> 512, 256, 128, 64, 32, 16, 8, 4, 2

        // n n/2 n/4 n/2^3 n/2^4 n/2^5 ...... 1
        // n/2^k = 1
        // n = 2^k
        // log(n) = k log(2)
        // k = log(n) / log(2)
        // Time complexity: O(log(n))
        for (int m = number ; m > 1 ; m /= 2 /* --> m = m / 2*/) {
            System.out.println(m);
        }

        // Time Complexity: O(log(n))
        for (int m = number ; m > 1 ; m /= 3 /* --> m = m / 3*/) {
            System.out.println(m);
        }
    }
}
