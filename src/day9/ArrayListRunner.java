package day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRunner {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<String> messages = new ArrayList<>();
        List<List<Integer>> matrix = new ArrayList<>();

        messages.add("hello");
        messages.add("text");
        messages.add("i am here");

        messages.set(0, "bye bye");

        // array[0] --> [] indexing operator
        System.out.println(messages.get(0));

        messages.sort(String::compareTo);
        System.out.println(messages.toString());

        System.out.println(messages.size());

        System.out.println(numbers.isEmpty());
        numbers.add(100);
        System.out.println(numbers.isEmpty());
    }
}
