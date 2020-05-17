package day2;

public class Loops {
    // Time Complexity: O(1)
    public static void main(String[] args) {
//        for (initialization_expression ; conditional_expression ; incrimentation_expression) {
//            code you want to execuite
//        }

        // i = i oper (+ - / * % ^) num i = i + 4 ----> i opr= numer i += 4
        for (int i = 0 ; i < 10 ; i += 2) {
            System.out.println(i);
        }

        System.out.println("loop has ended");

        // While Loop
//        while (condition) {
//
//        }

        int var = 5;
        while (var-- > 0) {
            System.out.println("true");
            System.out.println(var);
        }
        System.out.println(var);
    }
}
