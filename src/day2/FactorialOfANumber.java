package day2;

import java.util.Scanner;

public class FactorialOfANumber {
    // 3! = 1 * 2 * 3 = 6
    // 1! = 1
    // 2! = 1 * 2 = 2
    // 5! = 1 * 2 * 3 * 4 * 5 = 120
    // n! = n * (n-1)!

    // Time Complexity: O(1) + O(1) + O(1) + O(n) + O(1) = O(n)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //o1 O(1)
        int number = scanner.nextInt();             // o2 O(1)
        int answer = 1;                             // o3 O(1)

        // time complexity: o3 + (o4 + o5) * number = k_1 + k_2 * number = O(number)
        // x^2 + x = O(x^2)
        // k + 3 = O(k) = O(1)
        // x + 1 + x^2 + x^3 = O(x^3)
        // 1 + x = O(x)
        // 1 + x + 5x^2 = O(x^2)
        // ln(x) + x + 5 = O(x)
        // x^3 + 2^x = O(2^x)
        // Time complexity: O(n)
        for (int i = 1 ; i <= number ; i++) {
            answer = answer * i;
        }
        System.out.println(answer);                 // O(1)
    }
}
