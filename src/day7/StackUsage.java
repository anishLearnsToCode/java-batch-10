package day7;

public class StackUsage {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(10); // [10]
        stack.push(0); // [10 0]
        stack.push(-96); // 10 0 -96]
        System.out.println(stack.size()); // 3

        System.out.println(stack.peek()); // -96

        stack.pop(); // -96  [10 0]
        System.out.println(stack.peek()); // 0
        System.out.println(stack.size()); // 2

        MyStack s1 = new MyStack();
        MyStack s2 = new MyStack();
    }
}
