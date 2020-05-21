package day9;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRunner {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        queue.add(10);
        queue.add(-45);
        queue.add(34);
        queue.add(100);
        queue.add(-4);

        System.out.println(queue.size());
        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }
}
