package day7;

import java.util.Scanner;

public class OOPS {
    public static void main(String[] args) {
//        String string = "text";
//        System.out.println(string.substring(2));
//        System.out.println(string.equals("text"));

        Object object = new Object();

        Scanner scanner = new Scanner(System.in);

        Student student;
        student = new Student("test", "tst");

        System.out.println(student.firstName);
        System.out.println(student.rollNo);

        student.firstName = "elon";
        student.lastName = "musk";

//        System.out.println(student.firstName + student.lastName);
        student.fullName();

        Vehicle maruti = new Vehicle();
        Vehicle hyundai = new Vehicle();

        maruti.color = "red";
        hyundai.color = "yellow";

        System.out.println(maruti.color);
        System.out.println(hyundai.color);
    }

    private static void fullName(String firstName, String lastName) {

    }
}
