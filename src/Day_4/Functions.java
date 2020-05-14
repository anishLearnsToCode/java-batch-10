package Day_4;

public class Functions {
    public static void main(String[] args) {
//        helloWorld();
//        helloWorld();
//        helloWorld();
//
//        String text = hello();
//        System.out.println(text);
//
//        System.out.println(hello());

        System.out.println(fullName("anish", "sachdeva"));
    }

    // [access-modifier] [return type] [name] (..arguments) {
    //  code
    // }

    public static void helloWorld() {
        System.out.println("Hello world");
    }

    public static String hello() {
        return "java";
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
