package chapter10;

/**
 * Created by lcp on 16/4/16.
 */

class Outer1 {
    class Inner {

    }
}

public class OtherClass5 {


    Outer1 outer1;
    Outer1.Inner inner = outer1.new Inner();

}
