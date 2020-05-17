package day3;

import java.util.Scanner;

public class Pattern4 {
    /*
    n = 4
    *---
    **--
    ***-
    ****

    n = 3
    *--
    **-
    ***

    n = 5
    *----
    **---
    ***--
    ****-
    *****
     */

    // Time complexity: O(n^2)
    public static void main(String[] args) {
        // 1. User input

        // 2. Printing the pattern

        // For every row
            // 1. print *
            // 2. print -

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        // Time complexity: O(n*n) = O(n^2)
        for (int i = 0 ; i < n ; i++) {
            // Time complexity for the block: O(n)
            // i + 1 + n - i - 1 = O(n)

            // print stars
            for (int j = 0 ; j < i + 1 ; j++) {
                System.out.print("*");
            }

            // print -
            for (int j = 0 ; j < n - i - 1 ; j++) {
                System.out.print("-");
            }

            // new line
            System.out.println();
        }
    }
}
