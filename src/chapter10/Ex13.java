package chapter10;

/**
 * Created by lcp on 16/4/16.
 */

interface Ex13Interface {
    void say(String s);
}

public class Ex13 {

    Ex13Interface inner() {
        return new Ex13Interface() {
            @Override
            public void say(String s) {
                System.out.println(s);
            }
        };
    }

    public static void main(String[] args) {
        Ex13 ex13 = new Ex13();
        ex13.inner().say("hi");
    }

}
