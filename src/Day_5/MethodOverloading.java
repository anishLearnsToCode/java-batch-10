package Day_5;

public class MethodOverloading {
    public static void main(String[] args) {
    }

    private static byte sum(byte a, byte b) {
        System.out.println("byte");
        return (byte) (a + b);
    }

    private static short sum(short a, short b) {
        System.out.println("short");
        return (short) (a + b);
    }

    private static int sum(int a, int b) {
        System.out.println("int");
        return a + b;
    }

    private static long sum(long a, long b) {
        System.out.println("long");
        return a + b;
    }

    private static float sum(float a, float b) {
        System.out.println("float");
        return a + b;
    }

    private static double sum(double a, double b) {
        System.out.println("double");
        return  a + b;
    }

    private static char sum(char a, char b) {
        System.out.println("char");
        return (char) (a + b);
    }
}
