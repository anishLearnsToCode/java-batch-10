package day9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetRunners {
    public static void main(String[] args) {
        // 1, 2, 3
        // 1, 1, 1, 2 --> 1, 2

        // Generics
        Set<Book> library = new HashSet<>();

        library.add(new Book("harry potter"));
        library.add(new Book("harry potter"));
        library.add(new Book("clean code"));

        System.out.println(library);


        Book harryPotter = new Book("harry potter", "j k");
        Book other = new Book("harry potter", "j k");
        System.out.println(harryPotter.equals(other));

        String s1 = new String("hello");
        String s2 = new String("hello");
        // for objects == --> address
//        System.out.println(s1 == s2);
    }
}
