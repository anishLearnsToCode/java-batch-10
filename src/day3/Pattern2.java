package day3;

import java.util.Scanner;

public class Pattern2 {
    /*
    rows , columns
    rows =4, columns = 2
    **
    **
    **
    **

    rows = 3 columns = 6
    ******
    ******
    ******
     */

    // Time complexity: O(rows * columns)
    public static void main(String[] args) {
        // 1. Take input from user

        // for every row (0 --> row)
            // print * column no. of times
            // go to the next row

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        scanner.close();

        // Time Complexity: O(rows * columns)
        for (int i = 0 ; i < rows ; i++) {
            // Time complexity: O(columns)
            for (int j = 0 ; j < columns ; j++) {
                System.out.print("*"); // Time complexiy: O(1)
            }
            System.out.println();
        }
    }
}
