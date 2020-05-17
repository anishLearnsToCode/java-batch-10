package day3;

import java.util.Scanner;

public class Pattern1 {

    // Time Complexity: O(number)
    public static void main(String[] args) {
        // 1. Take input from user
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        // 2. Print pattern
        // number of stars = m
        // Multiple Line Comment
        /*
            n = 6, m = 4
            ****
            ****
            ****
            ****
            ****
            ****
         */
        for (int i = 0 ; i < number ; i++) {
            System.out.println("**********");
        }
    }
}
