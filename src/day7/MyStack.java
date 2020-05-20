package day7;

// LIFO - last in first out
/*
    []

    push 0
    [0]

    push 10
    [0 10]

    push 23
    [0 10 23]

    pop
    [0 10]

    push 100
    [0 10 100]

    pop
    [0 10]

    pop
    [0]

    size
    1

    size
    1

    pop
    []

    push 90
    [90]
 */
public class MyStack {
    private final int[] data = new int[10];
    private int size = 0;

    /*
    Put element on top
     */
    public void push(int number) {
        if (size >= 10) {
            System.out.println("Stack Overflow");
        } else {
            data[size++] = number;
        }
    }

    /*
    Value of element on top
     */
    public int peek() {
        if (size == 0) {
            System.out.println("Stack is empty");
        } else {
            return data[size - 1];
        }
        return 0;
    }

    // remove element from top
    public int pop() {
        if (size == 0) {
            System.out.println("stack underflow");
        } else {
            int element = peek();
            size--;
            return element;
        }
        return 0;
    }

    /*
    Number of elements in stack
     */
    public int size() {
        return size;
    }
}
