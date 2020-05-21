package day9;

public abstract class Food {
    public void make() {
        step1();
        addToppings();
        step2();
    }

    private void step1() {
        System.out.println("i am in food step 1");
    }
    private void step2() {
        System.out.println("i am in food step 2");
    }
    abstract void addToppings();
}

class Pizza extends Food implements Comparable<Pizza> {
    int radius;

    Pizza(int radius) {
        this.radius = radius;
    }

    @Override
    protected void addToppings() {
        System.out.println("ädding peppers");
    }

    @Override
    public int compareTo(Pizza other) {
//        if (this.radius < other.radius) {
//            return -1;
//        } else if (this.radius == other.radius) {
//            return 0;
//        } else {
//            return 1;
//        }
//
        return Integer.compare(this.radius, other.radius);
    }
}

class Sandwhich extends Food {

    @Override
    protected void addToppings() {
        System.out.println("adding tomatoes");
    }
}
