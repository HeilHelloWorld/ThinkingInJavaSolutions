package chapter10;

/**
 * Created by lcp on 16/4/16.
 */
interface Ex10Interface {
    void say(String s);
}

public class Ex10 {

    public Ex10Interface f() {
        if(true) {
            class Inner implements Ex10Interface {
                @Override
                public void say(String s) {

                }
            }
            return new Inner();
        }
        return null;
    }

}
