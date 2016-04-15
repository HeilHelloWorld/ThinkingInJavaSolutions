package chapter9;

import java.util.Random;

/**
 * Created by lcp on 16/4/15.
 */
public class RandomChars {
    private static Random random = new Random();

    public char next() {
        return (char) random.nextInt(128);
    }

    public static void main(String[] args) {
        RandomChars randomChars = new RandomChars();

        for (int i = 0; i < 100; i++) {
            System.out.print( i + ". ");
            System.out.println(randomChars.next());
        }
    }
}
