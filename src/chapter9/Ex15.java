package chapter9;

/**
 * Created by lcp on 16/4/15.
 */

interface B1 {
    void u();
    void x();
}

interface B2 {
    void w();
    void y();
}

interface B3 {
    void o();
    void p();
}

interface B4 extends B1, B2, B3 {
    void l();
}

abstract class Y {

    abstract void q();

}

class Y1 extends Y implements B4 {
    @Override
    void q() {

    }

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


public class Ex15 {
    public static void m1(B1 a1) {}
    public static void m2(B2 a2) {}
    public static void m3(B3 a3) {}
    public static void m4(B4 a4) {}

    public static void main(String[] args) {
        Y1 x1 = new Y1();

        m1(x1);
        m2(x1);
        m3(x1);
        m4(x1);
    }

}
