package chapter9;

/**
 * Created by lcp on 16/4/15.
 */
interface Cycle {
    void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

class UniCycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("ride unicycle");
    }
}

class UniCycleFactory implements CycleFactory {
    public UniCycle getCycle() {
        return new UniCycle();
    }
}

class BiCycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("ride BiCycle");
    }
}

class BiCycleFactory implements CycleFactory {
    public BiCycle getCycle() {
        return new BiCycle();
    }
}

class TriCycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("ride TriCycle");
    }
}

class TriCycleFactory implements CycleFactory {
    public TriCycle getCycle() {
        return new TriCycle();
    }
}

public class Cycles {
    public static void rideCycle(CycleFactory cycleFactory) {
        Cycle cycle = cycleFactory.getCycle();
        cycle.ride();
    }

    public static void main(String[] args) {
        rideCycle(new TriCycleFactory());
        rideCycle(new UniCycleFactory());
        rideCycle(new BiCycleFactory());
    }


}
