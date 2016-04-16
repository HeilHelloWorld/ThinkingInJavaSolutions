package chapter10;

/**
 * Created by lcp on 16/4/16.
 */

class First {
    First(String s) {
        System.out.println(s);
    }
}

public class Ex15  {
    First f() {
        return new First("haha") {};
    }

    public static void main(String[] args) {
        Ex15 ex15 = new Ex15();

        ex15.f();
    }

}
