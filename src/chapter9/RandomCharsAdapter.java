package chapter9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created by lcp on 16/4/15.
 */
public class RandomCharsAdapter extends RandomChars implements Readable {
    private int count;

    RandomCharsAdapter(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        String result = Character.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomCharsAdapter(20));

        while (s.hasNext()) {
            System.out.println(s.next() + " ");
        }
    }
}
