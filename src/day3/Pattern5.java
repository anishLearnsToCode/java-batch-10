package day3;

import java.util.Scanner;

public class Pattern5 {
    /*
    n = 3
    __*
    _**
    ***

    n = 5
    ____*
    ___**
    __***
    _****
    *****

    no of stars = i + 1
    no of spaces = n - i - 1
     */

    // Time complexity: O(n^2)
    public static void main(String[] args) {
        // 1. User Input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        // Printing the pattern
        for (int i = 0 ; i < n ; i++) {
            // printing space " "
            for (int j = 0 ; j < n - i - 1 ; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 0 ; j < i + 1 ; j++) {
                System.out.print("*");
            }

            // next line
            System.out.println();
        }
    }
}
