package Day_2;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1 ; i <= number ; i++) {
//            sum = sum + i;
            sum += i;
        }
        System.out.println(sum);
    }
}
