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

    }
}
