package chapter10;

/**
 * Created by lcp on 16/4/16.
 */

interface Ex12Interface {
    void method();
}

public class Ex12 {
    private int i  = 0;

    public void showI() {
        System.out.println(i);
    }

    public void sayHi() {
        System.out.println("Hi!");
    }

    public Ex12Interface inner() {
        return new Ex12Interface() {
            @Override
            public void method() {
                i = 3;
                sayHi();
            }
        };
    }

    public static void main(String[] args) {
        Ex12 ex12 = new Ex12();
        ex12.showI();
        ex12.inner().method();
        ex12.showI();
    }

}
