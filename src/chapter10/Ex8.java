package chapter10;

/**
 * Created by lcp on 16/4/16.
 */
public class Ex8 {

    public int getInnerVirable() {
        Inner inner = this.new Inner();
        return inner.i;
    }

    class Inner {
        private int i = 10;
    }

}
