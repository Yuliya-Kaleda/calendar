package nyc.c4q.ac21.calendar;

import java.util.Calendar;
import java.util.HashMap;

/**
 * Created by sufeizhao on 3/29/15.
 */
public class test {

    public static void main(String[] args) {
        HashMap<Integer, Calendar> one = new HashMap<Integer, Calendar>();
        HashMap<Integer, Calendar> two = new HashMap<Integer, Calendar>();

        System.out.println(DST.isDST(DateTools.parseDate("2015-11-09")));

        System.out.println(DateTools.parseDate("2015-03-28").get(Calendar.DATE));
    }
}
