package day8;

//    Car: Derived class    Vehicle : Base Class
public class Car extends Vehicle {
    Car() {
        super();
        System.out.println("i am in car");
    }

    Car(int capacity) {
        super(capacity, 4);
        System.out.println("i am car " + capacity);
    }

    public void drive() {}
    public void nuetral() {}
    public void park() {}
}
