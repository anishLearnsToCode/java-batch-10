package day5;

public class Area {
    public static void main(String[] args) {
        System.out.println(area(10));
        System.out.println(area(5, 8));
        System.out.println(area(1, area(2)));
        // area(1, area(2))
        // 1 * area(2)
        // 1 * (2 * 2)
        // 1 * 4
        // 4

        // f(x) = x
        // g(x) = x + 2
        // h(x) = x^2
        // h(g(x)) = (x+2)^2

//        int answer = area(1, area(2, 3));
        int answer = area(3, area(2, 10));
        System.out.println(answer);
    }

    // Method Signature: area(int)
    private static int area(int side) {
        return side * side;
    }

    // Method Signature: area(int, int)
    private static int area(int length, int bredth) {
        return length * bredth;
    }
}
