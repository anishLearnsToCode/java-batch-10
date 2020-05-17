package day2;

import java.util.Scanner;

public class Fibonacci {
    // 1, 1, 2, 3, 5, 8, 13, 21 ....
    // a_n = a_(n-1) + a_(n-2)
    // a_3 = a_2 + a_1
    // a_0 = 1 and a_1 = 1

    // Time Complexity: O(n)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                   // constant
        int number = scanner.nextInt();                             // constant
        scanner.close();                                            // constant

        System.out.println(1);                                      // constant
        // 0 1 1 2 3 5 8 13
        // temp = 8 // serves no logical purpose at all
        // previous = 13
        // secondLast = 8
        // index = 6 ---> number_of_times to print
        // Time complexity : n - 1 = O(n)
        for (int previous = 1, secondLast = 0, index = 0 ; index < number - 1 ; index++) {
            System.out.println(previous + secondLast);
            int temp = previous;
            previous = previous + secondLast;
            secondLast = temp;
        }
    }
}
