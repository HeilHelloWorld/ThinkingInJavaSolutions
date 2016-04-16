package chapter10;

/**
 * Created by lcp on 16/4/16.
 */

interface Ex9Interface {
    void say(String s);
}

public class Ex9 {

    Ex9Interface f() {
        class Inner implements Ex9Interface{
            @Override
            public void say(String s) {
            }
        }

        return new Inner();
    }

}
