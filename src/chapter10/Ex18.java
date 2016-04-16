package chapter10;

/**
 * Created by lcp on 16/4/16.
 */
public class Ex18 {

    Ex18() {
        System.out.println("Ex18()");
    }


    void f() {
        System.out.println("hello");
    }

    public static class Nest {
        Nest() {
            System.out.println("Nest()");
        }
    }


    public static void main(String[] args) {
        Ex18 ex18 = new Ex18();
        Nest nest = new Nest();
    }
}
