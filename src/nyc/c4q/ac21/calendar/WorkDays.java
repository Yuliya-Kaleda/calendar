package nyc.c4q.ac21.calendar;

import java.io.BufferedOutputStream;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class WorkDays {

    /**
     * Builds a map from day of week to whether this is a work day.
     * @return
     *   A map with keys 'Calendar.MONDAY' through 'Calendar.SUNDAY', indicating whether each is a work day.
     */
    public static HashMap<Integer, Boolean> getWorkDays() {
        HashMap <Integer, Boolean> workDays = new HashMap<Integer, Boolean>();
        workDays.put(0, false);
        workDays.put(1, true);
        workDays.put(2, true);
        workDays.put(3, true);
        workDays.put(4, true);
        workDays.put(5, true);
        workDays.put(6, false);
        return workDays;
    }

}
