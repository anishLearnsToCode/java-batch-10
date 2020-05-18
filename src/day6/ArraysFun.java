package day6;

import java.util.Scanner;

public class ArraysFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int length = scanner.nextInt();

        // Array creation
        // recommended OK
        int[] array = new int[10];

        // not recommended
        int a[] = new int[5];
        int[] b = { 1, 2, 3 };

//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);

        array[4] = 100;
        array[0] = -9;
        array[1] = 10;
        array[0]++;

        // in RAM : [ 0, 0, 0 , 0 .. 0 ]
        // address --> java
        // array <-- address

        System.out.println(array);

        System.out.println(array[0]);

        System.out.println(array.length);

        int[] array2 = array.clone();

        array2[1] = 100;

        // Output ???
        System.out.println(array[1]);

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
