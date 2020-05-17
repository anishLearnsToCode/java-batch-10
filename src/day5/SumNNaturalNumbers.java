package day5;

import java.util.Scanner;

public class SumNNaturalNumbers {
    /*
    input N
    sum of 1 + 2 + 3 + 4 + ... + N

    (1 + 2 + 3 + .... N-1)
    f(N) = 1 + 2 + 3 + 4 + 5 + .... N
    f(N-1) = 1 + 2 + 3 + 4 + .... (N-1)
    f(N) =

    1 + 2 + 3 + 4
    1 + 2 + 3 (+4)

    N = 3
    1 + 2 + 3
    N = 2
    1 + 2

    f(0) = 0
    f(1) = f(0) + 1
    f(2) = f(1) + 2
    f(3) = f(2) + 3
    f(4) = f(3) + 4
    f(5) = f(4) + 5
    f(6) = f(5) + 6
    f(n) = f(n-1) + n
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        System.out.println(sum(number));
        // print(6)
    }


    // sum(3)
    // number = 3
    // 3 == 0 false
    // return (3 + sum(2)) --> return 3 + 3
    // return 6

    // sum(2)
    // number = 2
    // 2 == 0 false
    // return (2 + sum(1))  --> return 2 + 1
    // return 3

    // sum(1)
    // number = 1
    // 1 == 0 false
    // return 1 + sum(0) --> return 1 + 0
    // return 1

    // sum(0)
    // number = 0
    // 0 == 0 true
    // return 0
    private static int sum(int number) {
        if (number == 0) {
            return 0;
        }

        return number + sum(number - 1);
    }
}
