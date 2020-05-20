package day7;

public class Static {
    public static void main() {
        System.out.println(Math.sqrt(16));
        System.out.println(Math.min(16, 0));

        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();

        System.out.println(Calculator.PI);

        System.out.println(Student.DRIVING_THRESHOLD);
    }
}

class Abc {
    Abc() {
        System.out.println("hello");
    }
}

class Calculator {
    public static double PI = 3.14;

    public int add(int a, int b) {
        return 0;
    }
}
