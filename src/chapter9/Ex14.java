package chapter9;

/**
 * Created by lcp on 16/4/15.
 */

interface A1 {
    void u();
    void x();
}

interface A2 {
    void w();
    void y();
}

interface A3 {
    void o();
    void p();
}

interface A4 extends A1, A2, A3 {
    void l();
}

class X {

}

class X1 extends X implements A4 {
    @Override
    public void u() {

    }

    @Override
    public void x() {

    }

    @Override
    public void w() {

    }

    @Override
    public void y() {

    }

    @Override
    public void o() {

    }

    @Override
    public void p() {

    }

    @Override
    public void l() {

    }

}


public class Ex14 {
    public static void m1(A1 a1) {}
    public static void m2(A2 a2) {}
    public static void m3(A3 a3) {}
    public static void m4(A4 a4) {}

    public static void main(String[] args) {
        X1 x1 = new X1();

        m1(x1);
        m2(x1);
        m3(x1);
        m4(x1);
    }

}

