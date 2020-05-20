package day8;

public class FinalRunner {
    public static void main(String[] args) {
        FinalClass f = new FinalClass();
        FinalClass a = new FinalClass(10);

        System.out.println(f.DRIVING_AGE);
        System.out.println(a.DRIVING_AGE);

        int i = 10;
        String value = Integer.toString(12);
        System.out.println(value + 10);

//        int integer = Integer.parseInt("hello");
//        System.out.println(integer + 10);

        Integer.toString(123);

        System.out.println(1000 + "" + 12);
        // 1000 + "" + 12
        // "1000" + "" + 12
        // "1000" + 12
        // "1000" + "12"
        // "100012"

        Long l;
        Boolean b;
        Character c;
        Double d;
    }
}
