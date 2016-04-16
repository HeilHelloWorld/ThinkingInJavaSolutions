package chapter10;

/**
 * Created by lcp on 16/4/16.
 */
public class Outer3 {
    private String s;

    public Outer3(String s) {
        this.s = s;
    }

    class Inner {
        Inner() {
            System.out.println("I'm inner class.");
        }

        public String toString() {
            return s;
        }

        public Outer3 returnOuter() {
            //生成对外部类对象的引用,可以使用外部类的名字加.this

            return Outer3.this;
        }

    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        //并不能这样直接创建内部类的对象 你必须有外部类的对象才可以去创建一个内部类的对象
       // Outer3.Inner inner3 = Outer3.Inner();

        //.new 来创建内部类的对象
        Outer3 outer3 = new Outer3("hello");

        Outer3.Inner inner1 = outer3.new Inner();

        Outer3.Inner inner = new Outer3("hello").getInner();

        System.out.println(inner.toString());
    }

}

