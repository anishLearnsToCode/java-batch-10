package day1;

import java.util.Scanner;

public class Printer {
    // Time complexity: O(1)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();

        System.out.println(firstName + " " + lastName);
        scanner.close();
    }
}
