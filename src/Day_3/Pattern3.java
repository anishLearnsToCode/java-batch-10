package Day_3;

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

    public static void main(String[] args) {
        // 1. User Input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        // 2. Printing pattern
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
