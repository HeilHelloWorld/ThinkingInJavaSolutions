package chapter10;

/**
 * Created by lcp on 16/4/16.
 */
public class Ex7 {

    private int i = 0b101;

    private void change() {
        Inner inner = this.new Inner();
        inner.method();
    }

    public void print() {
        System.out.println("hello");
    }

    class Inner {
        void method() {
            i = 10;
            print();
        }
    }

    public static void main(String[] args) {
        Ex7 ex7 = new Ex7();

        System.out.println(ex7.i);

        ex7.change();

        System.out.println(ex7.i);
    }

}
