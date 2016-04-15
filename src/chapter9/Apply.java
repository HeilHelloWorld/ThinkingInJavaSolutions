package chapter9;

/**
 * Created by lcp on 16/4/15.
 */
public class Apply {
    public static void process(Processor p, Object o) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(o));
    }
}
