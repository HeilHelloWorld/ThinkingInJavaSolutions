package chapter10;

/**
 * 1. 内部类自动拥有外围类的所有成员的访问权.
 * 2. 当创建一个内部对象的时候,此内部对象类必定会捕获一个指向外围类的对象的引用.
 *
 * Created by lcp on 16/4/16.
 */

interface Selector {
    boolean end();
    Object current();
    void next();
}

class Word {
    private String word;
    public Word(String s) {
        this.word = s;
    }

    @Override
    public String toString() {
        return word;
    }
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object o) {
        items[next++] = o;
    }

    private class SequenceSelector implements Selector {
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
    }

    public Selector selector() {
        return new SequenceSelector();
    }


    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }

        Selector selector = sequence.selector();

        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }

        Word word1 = new Word("hello");
        Word word2 = new Word("world");
        Word word3 = new Word("sucks");
        Sequence words = new Sequence(3);
        words.add(word1);
        words.add(word2);
        words.add(word3);
        Selector selector1 = words.selector();

        while (!selector1.end()) {
            System.out.print(selector1.current() + " ");
            selector1.next();
        }
    }
}
