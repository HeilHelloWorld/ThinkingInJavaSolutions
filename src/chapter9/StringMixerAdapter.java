package chapter9;

/**
 * Created by lcp on 16/4/15.
 */
public class StringMixerAdapter implements Processor {
    StringMixer stringMixer;

    StringMixerAdapter(StringMixer stringMixer) {
        this.stringMixer = stringMixer;
    }

    @Override
    public String name() {
        return "StringMixerAdapter";
    }

    @Override
    public String process(Object input) {

        return stringMixer.process((String) input);
    }

    public static void main(String[] args) {
        String s = "Hello World!";

        Apply.process(new StringMixerAdapter(new StringMixer()), s);
    }
}
