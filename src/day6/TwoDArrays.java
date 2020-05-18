package day6;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        // preferred
        int[][] matrix = new int[5][];

        // not preferred
//        int[] data[] = new int[100][];
        int a[][] = new int[5][];

//        System.out.println("Address of 2d block:" + matrix);
//        System.out.println(matrix[0]);

        matrix[0] = new int[1];
//        System.out.println(matrix[0]);

        int[][] data = new int[5][10];
//        System.out.println(data);
//        System.out.println("first address in data:" + data[0]);
//        System.out.println(data[0][0]);

//        System.out.println(data[1][1]);

        // data is 1d array --> addressed of other 1d arrays (5)
        // arrays stored --> 1d arrays int
//        System.out.println(data.length);
//        System.out.println(data[0].length);

        data = input();
        printFun(data);
    }

    private static int[][] input() {
        Scanner scanner = new Scanner(System.in);
        int rowNum = scanner.nextInt();
        int[][] matrix = new int[rowNum][];
        for (int row = 0 ; row < matrix.length ; row++) {
            int columns = scanner.nextInt();
            matrix[row] = new int[columns];
            for (int column = 0 ; column < matrix[row].length ; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static void print(int[][] matrix) {
        for (int row = 0 ; row < matrix.length ; row++) {
            for (int column = 0 ; column < matrix[row].length ; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    private static void printFun(int[][] data) {
        for (int[] row : data) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
