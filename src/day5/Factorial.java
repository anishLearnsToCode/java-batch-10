package day5;

public class Factorial {

    /*
    5 ! = 5.4.3.2.1
    4! = 4.3.2.1
    3! = 3.2.1
    2! = 2.1
    4! = 4.3!

    n! = n . (n-1)!
     */

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    // factorial(4)
    // 4 == 0 false
    // return 4 * factorial(3) --> 4 * 6 = 24
    // return 24

    // factorial(3)
    // number = 3
    // 3 == 0 false
    // return 3 * factorial(2) --> 3 * 2 = 6
    // return 6

    // factorial(2)
    // 2 == 0 false
    // return 2 * factorial(1) --> 2 * 1 = 2
    // return 2

    // factorial(1)
    // number = 1
    // 1 == 0 false
    // return 1 * factorial(0) --> return 1 * 1
    // return 1

    // factorial(0)
    // number = 0
    // 0 == 0 true
    // return 1
    // destroy !!!
    private static long factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
