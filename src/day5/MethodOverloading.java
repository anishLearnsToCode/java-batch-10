package day5;

public class MethodOverloading {
    public static void main(String[] args) {
//        System.out.println(sum(10, 11));
//        System.out.println(sum(10, 11.5));

//        float a = 1, b = 2;
//        System.out.println(sum(a, b));

//        System.out.println(sum(1, (float) 10));
        // int, float
        // float, float --> answer

//        System.out.println(sum('a', 1));
        // char (2), int (4)
        // ascii (unicode superset of ascii)
        // a --> '97' , 1
        // 97 + 1 = 98

//        System.out.println((char) 98);
//
//        for (int i = 0; i < 26 ; i++) {
//            System.out.print((char) (i + 97));
//        }

        System.out.println(sum(10.0, 4));
        System.out.println(sum((byte) 10, 4));
        System.out.println(sum((byte) 4, (byte) 4));

        System.out.println(sum((short) 10, (byte) 67));
    }

    // Method signature: sum(byte, byte)
    private static byte sum(byte a, byte b) {
        System.out.println("byte");
        return (byte) (a + b);
    }

    // Method Signature: sum(short, short)
    private static short sum(short a, short b) {
        System.out.println("short");
        return (short) (a + b);
    }

    // Method Signature: sum(int, int)
    private static int sum(int a, int b) {
        System.out.println("int");
        return a + b;
    }

    // Method Signature: sum(long, long)
    private static long sum(long a, long b) {
        System.out.println("long");
        return a + b;
    }

    // Method Signature: sum(float, float)
    private static float sum(float a, float b) {
        System.out.println("float");
        return a + b;
    }

    // Method signature: sum(double, double)
    private static double sum(double a, double b) {
        System.out.println("double");
        return  a + b;
    }

    // Method Signature: sum(char, char)
    private static char sum(char a, char b) {
        System.out.println("char");
        return (char) (a + b);
    }
}
