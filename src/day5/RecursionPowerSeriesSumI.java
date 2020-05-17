package day5;

import java.util.Scanner;

public class RecursionPowerSeriesSumI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();


    }

    private static long powerSeriesSum(int number) {
        return number == 1 ?
                1 :
                (long)Math.pow(number, number) + powerSeriesSum(number - 1);
    }
}
