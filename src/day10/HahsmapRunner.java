package day10;

import com.sun.javafx.logging.JFRInputEvent;
import day8.Circle;

import java.util.*;

public class HahsmapRunner {
    public static void main(String[] args) {
        // hashmap has bucket[]
        // bucket --> entries (list)
        // entry --> key, value

        // mod operator
        // index = hashcode % 10 = 0 - 9 O(hash)

        // bucket[index].put(entry) O(k)
        // bucket inserted O(1)
        // insertion time : O(hash + k) = O(1)

        // after 70% completion
        // bucket[] --> size: 20
        // index = hashcode % 20

        // bucket[index].put(entry)
        // after size grow --> old elements are added --> rehashing

        // Retrieve
        // key
        // key.hashcode() O(hash)
        // index = hashcode % size
        // search O(k)
        // value --> null
        // retrieval: O(hash + 1 + k) = O(1)

        Map<Circle, Integer> map = new HashMap<>();
        map.put(new Circle(0), 10);
        map.put(new Circle(1), 10);
        map.put(new Circle(2), 10);
        map.put(new Circle(3), 10);
        map.put(new Circle(4), 10);
        map.put(new Circle(5), 10);
        System.out.println(map);

        Set<Integer> set = new HashSet<>();
        System.out.println(set.hashCode());

        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set);
        System.out.println(set.hashCode());

        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(1);
        System.out.println(set1.hashCode());

        System.out.println(set.equals(set1));
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(10);
        numbers.add(-9);

        set.addAll(numbers);
        System.out.println(set);

        for (int number : set) {
            System.out.print(number + " ");
        }
    }
}
