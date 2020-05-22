package day8;

import org.omg.CORBA.CharSeqHolder;

import java.util.Objects;

public class Student {
    private final int hash = calculateHashcode();
    String firstName = "";
    String lastName = "";
    private final long rollNo;
    private double cgpa;

    public Student(int rollNo) {
        this.rollNo = rollNo;
    }

    public Student(long rollNo, double cgpa) {
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Student) {
            Student other = (Student) obj;
            return this.rollNo == other.rollNo
                    && this.firstName.equals(other.firstName)
                    && this.lastName.equals(other.lastName)
                    && this.cgpa == other.cgpa;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, firstName, lastName, cgpa);
    }

    private int calculateHashcode() {
        return Objects.hash(rollNo, firstName, lastName, cgpa);
    }
}
