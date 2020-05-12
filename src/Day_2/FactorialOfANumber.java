package Day_2;

import java.util.Scanner;

public class FactorialOfANumber {
    // 3! = 1 * 2 * 3 = 6
    // 1! = 1
    // 2! = 1 * 2 = 2
    // 5! = 1 * 2 * 3 * 4 * 5 = 120
    // n! = n * (n-1)!

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int answer = 1;

        for (int i = 1 ; i <= number ; i++) {
            answer = answer * i;
        }
        System.out.println(answer);
    }
}
