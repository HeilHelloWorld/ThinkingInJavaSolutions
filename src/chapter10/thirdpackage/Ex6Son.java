package chapter10.thirdpackage;

import chapter10.firstpackage.Ex6Inteface;
import chapter10.secondpackage.Ex6Base;

/**
 * Created by lcp on 16/4/16.
 */
public class Ex6Son extends Ex6Base {

    public Ex6Inteface getInner() {
        return this.new Ex6BaseInner();
    }

}
