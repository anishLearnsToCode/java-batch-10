package day6;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int index = 0 ; index < array.length ; index++) {
            array[index] = scanner.nextInt();
        }

        System.out.println(sum(array));
    }

    /*
        array = [1, 2, 3]
        return 1 + 2 + 3 = 6

        array = [1, 10]
        return 11

        index :  0   1   2
        array = [0, -8, 4]
        return -4
     */
    private static int sum(int[] array) {
        int sum = 0;
        for (int i = 0 ; i < array.length ; i++) {
            sum += array[i];
        }
        return sum;
    }
}
