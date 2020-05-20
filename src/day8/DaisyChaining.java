package day8;

import java.util.Objects;

public class DaisyChaining {
    public static void main(String[] args) {
        // i am in a
//        A objA = new A();

        // i am in a
        // i am in b
//        B objB = new B();

        // i am in a
        // i am in b
        // i am in c
//        C objC = new C();

        // i am in a
        // i am in b
        // i am in c
        // i am in d
        D objD = new D();
        D other = objD;

        System.out.println(objD.equals(other));
        String var = new String("hello");
        String val = new String("hello");
        System.out.println(var.equals(val));

        System.out.println(objD);
    }
}


class A {
    int a;
    A() {
        System.out.println("i am in A");
    }
}

class B extends A {
    int b;
    B() {
        System.out.println("i am in B");
    }
}

class C extends B {
    int c;
    C() {
        System.out.println("i am in C");
    }
}

class D extends C {
    int d;
    D() {
        System.out.println("i am in D");
    }

    @Override
    public String toString() {
        return "{" + d + "}";
    }
}