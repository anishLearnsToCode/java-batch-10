package day8;

public class EqualityCheck {
    public static void main(String[] args) {
        Student ram = new Student(1, 3.5);
        Student shyam = new Student(2, 3);
        Student obj = new Student(1);

        System.out.println(ram.equals(obj));
    }
}
