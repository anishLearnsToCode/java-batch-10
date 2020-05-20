package day8;

public class Vehicle {
    int numberOfWheels;
    int capacity;
    long model;
    String manufacturer;

    // signature:
    Vehicle() {
        System.out.println("i am in vehicle");
    }

    Vehicle(int capacity, int numberOfWheels) {
        System.out.println("I am in vehicle " + numberOfWheels);
        this.capacity = capacity;
        this.numberOfWheels = numberOfWheels;
    }
}
