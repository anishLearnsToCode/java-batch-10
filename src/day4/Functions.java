package day4;

public class Functions {
    public static void main(String[] args) {
        // synatx to call function: functionName(... args)

//        helloWorld();
//        helloWorld();
//        helloWorld();
//
//        String text = hello();
//        System.out.println(text);
//
//        System.out.println(hello());

//        System.out.println(fullName("anish", "sachdeva"));
//        System.out.println(fullName("anirban", "maiti"));

        System.out.println(sum(5, 6));
        System.out.println(difference(9, 4));
    }

    // [access-modifier] [return type] [name] (..arguments) {
    //  code
    // }

    public static void helloWorld() {
        System.out.println("Hello world");
    }

    public static String hello() {
        System.out.println();
        return "java";
//        System.out.println(); --> error
    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int difference(int a, int b) {
        return a - b;
    }
}
