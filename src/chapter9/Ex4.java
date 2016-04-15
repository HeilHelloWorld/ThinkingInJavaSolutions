package chapter9;

/**
 * Created by lcp on 16/4/15.
 */

abstract class A {
}

class B extends A {
    void print() {
        System.out.println("B");
    }
}

abstract class C {
    abstract void print();
}

class D extends C {
    @Override
    void print() {
        System.out.println("D");
    }
}

public class Ex4 {
    public static void test(A a) {
        ((B) a).print();
    }

    public static void secondTest(C c) {
        c.print();
    }

    public static void main(String[] args) {
        B b = new B();
        D d = new D();

        test(b);
        secondTest(d);
    }

}
