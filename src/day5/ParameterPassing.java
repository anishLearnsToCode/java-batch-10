package day5;

public class ParameterPassing {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        swap(i, j);
        swap(j, i);
        swap(j, i);
        swap(j, i);
        swap(j, i);
        swap(j, i);
        swap(j, i);
        System.out.println("i=" + i);
        System.out.println("j=" + j);

//        System.out.println("hello" + "world");
//        System.out.println("hello" + 10);
        // "hello" + "10"
        // "hello10"

//        System.out.println(10 + 30);
//        System.out.println(10 + " " + 30);
        // 10 + " " + 30
        // "10" + " " + 30
        // "10 " + 30
        // "10 " + "30"
        // "10 30"
    }

    private static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }
}
