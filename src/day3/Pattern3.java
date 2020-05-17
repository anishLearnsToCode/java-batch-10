package day3;

import java.util.Scanner;

public class Pattern3 {
    /*
    n = 5
    *
    **
    ***
    ****
    *****

    n = 3
    *
    **
    ***
     */

    // Time complexity: O(n^2)
    public static void main(String[] args) {
        // 1. User Input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        // 2. Printing pattern
        // Time Complexity: 1 + 2 + 3 + .... + n = n*(n+1)/2 = n^2/2 + n/2 = O(n^2)
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
