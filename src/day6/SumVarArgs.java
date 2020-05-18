package day6;

public class SumVarArgs {
    public static void main(String[] args) {
        System.out.println(sum(1));
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(sum(1, -10, 4));
    }

    private static int sum(int... numbers) {
        // numbers --> int[]
        int sum = 0;
        for (int index = 0 ; index < numbers.length ; index++) {
            sum += numbers[index];
        }
        return sum;
    }

}
