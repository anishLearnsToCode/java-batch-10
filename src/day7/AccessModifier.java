package day7;

public class AccessModifier {
    public static void main(String[] args) {
        Student student = new Student();
        Student bill = new Student();
        Student elon = new Student();

        System.out.println(bill.DRIVING_THRESHOLD);
        System.out.println(elon.DRIVING_THRESHOLD);
        System.out.println(student.DRIVING_THRESHOLD);
//        System.out.println(Student.DRIVING_THRESHOLD);

        elon.DRIVING_THRESHOLD = -100;
        System.out.println(bill.DRIVING_THRESHOLD);
        System.out.println(Student.DRIVING_THRESHOLD);

        // Class has members
        // members = properties + methods

        // Access Modifiers
        // Public --> completely visible
        // Protected --> self + ineritence (package | different package)
        // default --> self + inherit (package)
        // private --> self
    }
}
