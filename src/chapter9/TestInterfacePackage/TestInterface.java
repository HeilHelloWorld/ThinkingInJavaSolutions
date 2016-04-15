package chapter9.TestInterfacePackage;

import chapter9.InterfacePackage.ThreeMethod;

/**
 * Created by lcp on 16/4/15.
 */
public class TestInterface implements ThreeMethod {
    @Override
    public void print1() {
        System.out.println("1");
    }

    @Override
    public void print2() {
        System.out.println("2");
    }

    @Override
    public void print3() {
        System.out.println("3");
    }

    public static void main(String[] args) {
        TestInterface testInterface = new TestInterface();

        testInterface.print1();
        testInterface.print2();
        testInterface.print3();
    }
}
