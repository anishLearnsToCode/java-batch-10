package day9;

import java.util.Stack;

public class StackRunner {
    public static void main(String[] args) {
        final Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
//        stack.add(3);

//        System.out.println(stack.empty());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.size());

        stack.push(10);
        stack.push(-9);
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.pop();
        System.out.println(stack.size());

        stack.push(10);
        stack.push(100);
        stack.push(0);
        stack.push(-4);
        stack.push(4);
        stack.push(-3);

        System.out.println(stack.search(-3));
    }
}
