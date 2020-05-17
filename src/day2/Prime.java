package day2;

import java.util.Scanner;

public class Prime {
    // example : 2, 3, 5, 7, 11, 13, 17, 19 ....
    // they are numbers which are divisible only by 1 and themselves

    // Break statement
    // Time complexity: O(number)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean var = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("not prime");
                var = false;
                break; // break statement
            }
        }

        if (var) {
            System.out.println("prime");
        }
    }
}
