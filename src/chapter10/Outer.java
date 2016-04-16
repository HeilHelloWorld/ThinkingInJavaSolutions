package chapter10;

/**
 * Created by lcp on 16/4/16.
 */
public class Outer {
    class Inner {
        Inner() {
            System.out.println("I'm inner class.");
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().getInner();
    }

}
