package chapter9;

/**
 * Created by lcp on 16/4/15.
 */

interface CanDo {
    void doIt();
}

interface CanDoMore extends CanDo {
    void doMore();
}

interface CanDoFaster extends CanDo {
    void doFaster();
}

interface CanDoMost extends CanDoMore, CanDoFaster {
    void doMost();
}

class Doer implements CanDoMost {
    public void doIt() {}
    public void doMore() {}
    public void doFaster() {}
    public void doMost() {}
}

public class Ex13 {
    public static void main(String[] args) {
        Doer d = new Doer();
        d.doMore();
        d.doFaster();
        d.doIt();
    }
}
