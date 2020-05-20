package day7;

public class Student {
    public static int DRIVING_THRESHOLD;
    String firstName;
    String lastName;
    int rollNo;
    private double cgpa;

    static {
        System.out.println("i am in the static block");
        DRIVING_THRESHOLD = (int) (Math.random() * 20);
    }

    // Default Constructor
    Student() {
        System.out.println("I am in the default constructor");
    }

     // Parameterized Constructors
    Student(String firstName, String lastName) {
        System.out.println("i am in string string constructor");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Student(String firstName, String lastName, int rollNo) {
        System.out.println("I am in string string int - i want alll!!!!! constructor");
    }

    Student(int rollNo) {
        System.out.println("roll no is most important");
    }

    void fullName() {
        System.out.println(firstName + " " + lastName);
    }

    private void calculateCgpa() {

    }

    public double getCgpa() {
        return cgpa;
    }
}
