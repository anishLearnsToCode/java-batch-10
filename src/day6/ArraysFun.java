package day6;

import java.util.Scanner;

public class ArraysFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0 ; i < array.length ; i++) {
            array[i] = scanner.nextInt();
        }

        for (int index = 0  ; index < array.length ; index++) {
            System.out.println(array[index]);
        }


        scanner.close();
    }

    private static int sum(int... elements) {
        int sum = 0;
        for (int index = 0 ; index < elements.length ; index++) {
            sum += elements[index];
        }
        return sum;
    }
}
