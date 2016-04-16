package chapter10;

/**
 * Created by lcp on 16/4/16.
 */

interface Cycle{
    void method1();
    void method2();
}

interface CycleFactory {
    Cycle getCycle();
}

class UniCycle implements Cycle {
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    CycleFactory factory() {
        return new CycleFactory() {
            @Override
            public Cycle getCycle() {
                return new UniCycle();
            }
        };
    }
}

public class Cycles16 {
}
