package day9;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueRunner {
    public static void main(String[] args) {
        // T must impliment comparator --> compareTo()
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(2);
        queue.add(1);
        queue.add(0);

        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());

        Queue<Circle> circles = new PriorityQueue<>();
        circles.add(new Circle(9));
        circles.add(new Circle(3));
        circles.add(new Circle(0));
        circles.add(new Circle(100));

        System.out.println(circles.peek());

        Queue<Student> students = new PriorityQueue<>((first, second) -> {
            if (first.cgpa == second.cgpa) {
                return first.name.compareTo(second.name);
            }

            return Double.compare(second.cgpa, first.cgpa);
        });

        students.add(new Student("john", 3.5));
        students.add(new Student("anish", 2.0));
        students.add(new Student("mark", 3.99));
        students.add(new Student("kim", 2.1));
        students.add(new Student("lakshman", 2.1));

        System.out.println(students.peek());
        students.poll();
        System.out.println(students.peek());
        students.poll();
        System.out.println(students.peek());
        students.poll();
        System.out.println(students.peek());
        students.poll();

        System.out.println(students.peek());
    }
}
