package day8;

public class Student {
    String firstName;
    String lastName;
    private final long rollNo;
    private double cgpa;

    Student(int rollNo) {
        this.rollNo = rollNo;
    }

    Student(long rollNo, double cgpa) {
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj.getClass() == this.getClass()) {
            Student other = (Student) obj;
            return this.rollNo == other.rollNo;
        }
        return false;
    }
}
