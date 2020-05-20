package day8;

public class InheritanceRunner {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//        Vehicle car = new Vehicle(5, 4);
//        System.out.println(car.numberOfWheels);

//        Car maruti = new Car();
//        Car suv = new Car(7);

        Animal animal = new Animal();
        Zebra zebra = new Zebra();

        makeRun(animal);
        makeRun(zebra);
    }

    // Dynamic Binding
    private static void makeRun(Animal animal) {
        animal.run();
    }
}
