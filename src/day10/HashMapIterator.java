package day10;

import day8.Circle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapIterator {
    public static void main(String[] args) {
        Map<String, Integer> frequencies = new HashMap<>();
        frequencies.put("hello", 3);
        frequencies.put("world", 5);
        frequencies.put("a", 100);
        frequencies.put("i", 20);

        System.out.println(frequencies);

        Set<Map.Entry<String, Integer>> entries = frequencies.entrySet();
        System.out.println(entries);

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Set<Board> boards = new HashSet<>();
        boards.add(new Board(10));
        boards.add(new Board(3));
        boards.add(new Board(4));
        System.out.println(boards);

        for (Map.Entry<String, Integer> entry : frequencies.entrySet()) {
            System.out.println(entry.getKey() + " " + (entry.getValue() * 10));
        }
    }

    private static class Board {
        int side;

        Board(int side) {
            this.side = side;
        }

        @Override
        public String toString() {
            return "Board{" +
                    "side=" + side +
                    '}';
        }
    }
}
