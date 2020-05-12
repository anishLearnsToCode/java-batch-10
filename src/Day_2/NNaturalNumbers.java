package Day_2;

import java.util.Scanner;

public class NNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int index = 1 ; index <= number ; index++) {
            System.out.println(index);
        }
    }
}
