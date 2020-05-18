package day6;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int index = 0 ; index < array.length ; index++) {
            array[index] = scanner.nextInt();
        }

        int element = scanner.nextInt();

        System.out.println(linearSearch(array, element));
    }

    /*
        array : [1, 2, 3, 4]
        elem : 2
        asnwer : 1

        array : [1, 2, 3, 2, 4, 2]
        elem : 2
        answer : 1

        array : [1, 2, 3]
        elem : 10
        answer : -1
     */

    // indexes: 0 1 2
    // array : [1 2 3]
    // element : 10
    // index : 3
    // array length : 3
    private static int linearSearch(int[] array, int element) {
        for (int index = 0 ; index < array.length ; index++) {
            if (array[index] == element) {
                return index;
            }
        }

        // instantiation ; // condition ; //increment
        // body

        return -1;
    }
}
