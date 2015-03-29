package nyc.c4q.ac21.calendar;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("date? ");
        String dateString = scanner.nextLine();
        Calendar date = DateTools.parseDate(dateString);
        if (date == null)
            return;
        System.out.println();

        System.out.println("date:              " + DateTools.formatDate(date));

        // FIXME: Write the rest of this method!

        // 1. Show the day of the week.
        HashMap<Integer, String> dayOfWeekNames = DateTools.getDayOfWeekNames();
        // ...

        // 2. Show whether this is a work day.
        HashMap<Integer, Boolean> workDays = WorkDays.getWorkDays();


        // 3. Show whether this is a national holiday, and if so, which.
        HashMap<Calendar, String> holidays = Holidays.getHolidays("National holiday");
        if (holidays.containsKey(date)) {
            System.out.println(holidays.get(date));
        }
        else {
            System.out.println("Not a national holiday!");
        }
        // ...

        // 4. Show whether this date is in DST.
        //boolean isDST = DST.isDST(date);
        // ...

        // 5. Show the zodiac sign.
//        String zodiacSign = Zodiac.getZodiacSign(date);
        // ...

        // 6. Print out the monthly calendar.
//        CalendarPrinter.printMonthCalendar(date);

    }
}
