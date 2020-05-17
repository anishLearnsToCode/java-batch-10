package day3;

import java.util.Scanner;

public class Pattern6 {
    /*
    n = 3
    __*
    _***
    *****

    n = 2
    _*
    ***

    n = 5
    ____*
    ___***
    __*****
    _*******
    *********

    stars: 1, 3, 5, 7, 9, 11, 13, 15 ......
    spaces: 4, 3, 2, 1, 0
            2, 1, 1

    no of spaces = n - i - 1
    no of stars = 2i + 1
     */

    // Time complexity: O(rows^2)
    public static void main(String[] args) {
        // Take user input
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();

        // Print pattern
        // Time Complexity: (rows^2, 2*rows^2)
        // O(rows^2), O(rows^2)
        for (int i = 0 ; i < rows ; i++) {
            // Block Time Complexity
            // rows - i + 2*i = rows + i
            // i --> (0, rows)
            // rows + i --> (rows, 2*rows)

            // Print Spaces (rows - i - 1)
            for (int j = 0 ; j < rows - i - 1 ; j++) {
                System.out.print(" ");
            }

            // Print Stars (2*i + 1)
            for (int j = 0 ; j < 2 * i + 1 ; j++) {
                System.out.print("*");
            }

            // Goto next line
            System.out.println();
        }
    }
}
