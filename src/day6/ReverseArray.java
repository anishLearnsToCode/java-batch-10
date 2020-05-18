package day6;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int index = 0 ; index < array.length ; index++) {
            array[index] = scanner.nextInt();
        }

        int[] reverse = reverse(array);
        System.out.println(Arrays.toString(reverse));
    }

    /*
        array : [10 -90 5]
        answer : [5 -90 10]
        index i n --> n - i - 1

        array : [10 0 -10 67]
        answer [67 -10 0 10]
     */
    private static int[] reverse(int[] array) {
        int[] result = new int[array.length];

        // input values from array --> result
        for (int index = 0 ; index < array.length ; index++) {
            result[index] = array[array.length - index - 1];
        }

        return result;
    }
}
