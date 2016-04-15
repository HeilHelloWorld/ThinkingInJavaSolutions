package chapter9;

/**
 * Created by lcp on 16/4/15.
 */
interface CanFight {
    void fight();
}

interface CanFly {
    void fly();
}

interface CanSwim {
    void swim();
}

interface CanClimb {
    void climb();
}

class ActionCharacter {
    public void fight() {}
}

class Hero extends ActionCharacter
    implements CanClimb, CanFight, CanFly, CanSwim {
    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void climb() {

    }
}

public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }
    public static void u(CanSwim x) {
        x.swim();
    }
    public static void w(CanFly x) {
        x.fly();
    }
    public static void y(CanClimb x) {
        x.climb();
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        t(hero);
        u(hero);
    }
}
