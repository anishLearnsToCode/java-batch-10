package day1;

import java.util.Scanner;

public class Logic {
    public static void main(String[] args) {
        // Time Complexity: O(1)
        //

        Scanner scanner  = new Scanner(System.in);
        int number = 100;

        if (number % 2 == 1) {
            System.out.println("weird");
        } else if (number <= 5 && number >= 2) {
            System.out.println("not weird");
        } else if (number >= 6 && number <= 20){
            System.out.println("weird");
        } else if(number > 20) {
            System.out.println("not weird");
        }

        for (int index = 0 ; index < 10 ; index++) {
            System.out.println("hello world");
        }

        scanner.close();
    }
}
