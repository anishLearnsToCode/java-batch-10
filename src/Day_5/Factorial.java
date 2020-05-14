package Day_5;

public class Factorial {

    public static void main(String[] args) {

    }

    private static long factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
