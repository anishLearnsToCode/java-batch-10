package Day_5;

public class ParameterPassing {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        swap(i, j);
        System.out.println(i);
        System.out.println(j);
    }

    private static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }
}
