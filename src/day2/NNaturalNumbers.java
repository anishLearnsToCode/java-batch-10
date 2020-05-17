package day2;

import java.util.Scanner;

public class NNaturalNumbers {
    // Time Complexity: O(n)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);               //  constant
        int number = scanner.nextInt();                         // constant

        // Time complexity: O(n * k) = O(n)
        for (int index = 1 ; index <= number ; index++) {
            System.out.println(index); // complexity: constant
        }
    }
}
