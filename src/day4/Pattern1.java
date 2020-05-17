package day4;

import java.util.Scanner;

public class Pattern1 {
    /*
    columns = 6
    row = 6

    ******
    *____*
    *____*
    *____*
    *____*
    ******

    columns (m) = 3
    rows (n) = 5

    ***
    *_*
    *_*
    *_*
    ***

     */

    // Time Complexity: O(rows * columns)
    // 2*columns + rows * columns
    // columns * (2 + rows)
    // columns * rows = O(columns * rows)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        scanner.close();

        // first row
        // Time Complexity: O(columns)
        for (int i = 0 ; i < columns ; System.out.print("*"), i++);
        System.out.println();

        // Pattern
        // Time Complexiy: O(rows * columns)
        for (int i = 0 ; i < rows - 2 ; i++) {
            // Block Time Complexity: O(columns)
            System.out.print("*");
            for (int j = 0 ; j < columns - 2 ; System.out.print(" "), j++);
            System.out.println("*");
        }

        // last row
        // Time Complexity: O(columns)
        for (int i = 0 ; i < columns ; System.out.print("*"), i++);
    }
}
