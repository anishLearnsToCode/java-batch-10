package day8;


import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(0);
        list.add(-5);
        list.add(3);
        list.add(100);

        Integer integer = 100;
        System.out.println(integer);
        System.out.println(integer.toString());

        System.out.println(list.toString());
        list.sort(Integer::compareTo);
        System.out.println(list);

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        List<Integer> myList = new LinkedList<>();
        myList = new ArrayList<>();
        myList = new Vector<>();
        myList = new Stack<>();

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(2);

        System.out.println(set);

        for (int element : set) {
            System.out.print(element + " ");
        }

        int[] array = {1, 10, -100, 6, 8};

        for (int element : array) {
            System.out.print(element + " ");
        }

        String hello = "hellow world";
        // not valid
//        for (char character : hello) {
//            System.out.print(character + " ");
//        }
    }
}
