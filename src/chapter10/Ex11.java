package chapter10;

/**
 * Created by lcp on 16/4/16.
 */


public class Ex11 {

    private class Inner implements Ex11Interface {
        @Override
        public void say(String s) {
            System.out.println(s);
        }
    }

    Ex11Interface f() {
        return new Inner();
    }


    public static void main(String[] args) {
        Ex11 ex11 = new Ex11();

        ex11.f().say("hello");

    }
}
