package day2;

import java.util.Scanner;

public class MultiplicationTable {
    // 2 x 0 = 0
    // 2 x 1 = 2
    // 2 x 2 = 4
    // 2 x 3 = 6
    // 2 x 4 = 8

    // Time Complexity: O(1)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i =0 ; i <= 10 ; i++) {
            System.out.println(number + " x " + i + " = " + number * i) ;
        }
    }
}
