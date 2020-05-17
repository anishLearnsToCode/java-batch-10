package day1;

public class LogicalOperators {
    // Time complexity: O(1)

    public static void main(String[] args) {
        // System.out.println(true == true);

        boolean var = 6 <= 2;
        // System.out.println(var);

        boolean a = false;


        // square bracket ] --> index
        // culy brace { } --> type annotations

        // System.out.println(false && false);
        // System.out.println(true && false);
        // System.out.println(false && true);
        // System.out.println(true && true && true && false);

        // Logical OR (||)
        // ||

        // System.out.println(false || false);
        // System.out.println(false || true);
        // System.out.println(true || false);
        // System.out.println(true || true);

        // System.out.println(true || var);

        // System.out.println(false || var); // --> var

        // System.out.println(true && !false);

        // Boolean XOR - Exlusive OR (only one exclusively true)
        // System.out.println(false ^ false); // --> false
        // System.out.println(false ^ true); // --> true
        // System.out.println(true ^ false); // --> true
        // System.out.println(true ^ true); // --> false

        int d = 10;
        int b = 5 ;
        int c = 8;

        // System.out.println((d < b) && (b == c));
        // System.out.println((d < b) || (b != c));

        // System.out.println(!(!true));

        // System.out.println(!!!!!!! false);

        System.out.println(b < d && b <= d && c == d);
    }
}
