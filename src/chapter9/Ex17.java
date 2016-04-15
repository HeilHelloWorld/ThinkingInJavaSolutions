package chapter9;

/**
 * Created by lcp on 16/4/15.
 */

interface Days {
    int SUNDAY = 1, MONDAY = 2, TUESDAY = 3, WEDNESDAY = 4,
            THURSDAY = 5, FRIDAY = 6, SATURDAY = 7;
}

class Week implements Days {
    private static int count = 0;
    private int id = count++;
    public Week() {
        System.out.println("Week :" + id);
    }
}

public class Ex17 {

    public static void main(String[] args) {
        System.out.println(Days.FRIDAY);

        Week week0 = new Week();
        Week week1 = new Week();
//can't assign a value to a final value;
 //       Week.FRIDAY = 10;
    }

}
