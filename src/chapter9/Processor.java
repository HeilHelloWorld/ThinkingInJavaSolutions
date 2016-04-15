package chapter9;

/**
 * Created by lcp on 16/4/15.
 */
public interface Processor {
    String name();
    Object process(Object input);
}
