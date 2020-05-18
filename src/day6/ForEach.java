package day6;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };

        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println(sum);

        // NO Assignment !!!!!!!!!!!!!!!
        for (int number : array) {
            number = 10;
        }
        System.out.println(Arrays.toString(array));
    }
}
