package chapter9;

/**
 * Created by lcp on 16/4/15.
 */

abstract class Print {
    abstract void print();
    Print() {
        print();
    }
}

class Test extends Print {

    int i = 3;

    @Override
    void print() {
        System.out.println(i);
    }
}

public class Ex3 {
    public static void main(String[] args) {

        /*
        * 1. Storage for son allocated and initialized to binary zero
        * 2. Test() called Print() then print (s.i = 0);
        * 3. Initialize going  i = 3
        * 4. called Test.print();
        * */

        Test test = new Test();
        test.print();
    }
}
