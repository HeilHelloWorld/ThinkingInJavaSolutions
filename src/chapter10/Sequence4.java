package chapter10;

/**
 * 1. 内部类自动拥有外围类的所有成员的访问权.
 * 2. 当创建一个内部对象的时候,此内部对象类必定会捕获一个指向外围类的对象的引用.
 *
 * Created by lcp on 16/4/16.
 */

interface Selector4 {
    boolean end();
    Object current();
    void next();
}

class Word4 {
    private String word;
    public Word4(String s) {
        this.word = s;
    }

    @Override
    public String toString() {
        return word;
    }
}

public class Sequence4 {
    private Object[] items;
    private int next = 0;

    public Sequence4(int size) {
        items = new Object[size];
    }

    public void add(Object o) {
        items[next++] = o;
    }

    private class Sequence4Selector4 implements Selector4 {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i < items.length) {
                i++;
            }
        }

        public Sequence4 returnSequence4() {
            return Sequence4.this;
        }
    }

    public Selector4 selector() {
        return new Sequence4Selector4();
    }


    public static void main(String[] args) {
        Sequence4 sequence = new Sequence4(10);
        for(int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }

        Selector4 selector = sequence.selector();

        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }

        Word4 word1 = new Word4("hello");
        Word4 word2 = new Word4("world");
        Word4 word3 = new Word4("sucks");
        Sequence4 words = new Sequence4(3);
        words.add(word1);
        words.add(word2);
        words.add(word3);
        Selector4 selector1 = words.selector();

        while (!selector1.end()) {
            System.out.print(selector1.current() + " ");
            selector1.next();
        }
    }
}
