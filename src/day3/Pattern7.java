package day3;

import java.util.Scanner;

public class Pattern7 {
    /*
    n = 3
    __1
    _222
    33333

    n = 5
    ____1
    ___222
    __33333
    _4444444
    555555555

    spaces + number

    no of spaces = n - i - 1
    no of times number = 2i + 1
    number = i + 1

     */

    // Time Complexity: O(rows^2)
    public static void main(String[] args) {
        // User Input
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();

        // Print Pattern
        for (int i = 0 ; i < rows ; i++) {
            // Print spaces
            for (int j = 0 ; j < rows - i - 1 ; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 0 ; j < 2 * i + 1 ; j++) {
                System.out.print(i+1);
            }

            // Goto next line
            System.out.println();
        }
    }
}
