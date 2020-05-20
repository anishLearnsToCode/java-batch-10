package day8;

public class FinalClass {
    final int DRIVING_AGE;
    final static int CROSS;

    static {
        System.out.println("I am in static block");
        CROSS = 20;
    }

    // without parameters
    FinalClass() {
        DRIVING_AGE = 18;
    }

    // with parameters
    FinalClass(int age) {
        this.DRIVING_AGE = age;
    }
}
