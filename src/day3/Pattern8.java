package day3;

import java.util.Scanner;

public class Pattern8 {
    /*
    rows = 3
    __1
    _212
    32123

    rows = 5
    ____1
    ___212
    __32123
    _4321234
    543212345

    row = (spaces) (decreasing) (increasing)
        (spaces) (num ........ 1) (2   ..... number)

    decreasing number : 1, 2, 3, 4, 5 ....
    increasing: 1, 2, 3, 4, 5, 6, 7 ....

    no of spaces = n - i - 1
    decreasing number = i + 1
    increasing number = i + 1
     */

    // Time Complexity: O(rows^2)
    public static void main(String[] args) {
        // User Input
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();

        // Time Complexity: O(rows^2)
        for (int i = 0 ; i < rows ; i++) {
            // Block Time Complexity: O(rows)

            // Print spaces
            // Time Complexity: O(rows)
            for (int j = 0 ; j < rows - i - 1 ; j++) {
                System.out.print(" ");
            }

            // Decreasing
            // Time Complexity: O(rows)
            for (int j = i + 1 ; j >= 1 ; j--) {
                System.out.print(j);
            }

            // Increasing
            // Time Complexity: O(rows)
            for (int j = 2 ; j <= i + 1 ; j++) {
                System.out.print(j);
            }

            // Next line
            System.out.println();
        }
    }
}
