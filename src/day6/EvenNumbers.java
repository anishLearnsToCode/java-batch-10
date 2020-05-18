package day6;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int index = 0 ; index < array.length ; index++) {
            array[index] = scanner.nextInt();
        }

        System.out.println(evenNumbers(array));
    }

    /*
        array : []
        answer : 0

        array : [1, 2, 3]
        answer: 1

        array : [ 10, 9, 0, -4 ]
        answer : 3
     */
    private static int evenNumbers(int[] array) {
        int even = 0;
        for (int index = 0 ; index < array.length ; index++) {
            if (isEven(array[index])) {
                even++;
            }
        }
        return even;
    }

    /*
        number: 2
        answer: true

        number: 0
        answer: true

        number: -11
        answer: false
     */
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
