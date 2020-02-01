package luty.firstWeek.Saturday;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.SortedMap;


public class TimeCalculator {

    public void daysToChristmasEveInfo() {

        LocalDate today = LocalDate.now();
        daysToChristmasEve(today);

    }

    public void daysToChristmasEve(LocalDate today) {

        LocalDate nextChristmas = LocalDate.of(today.getYear(), 12, 24);

        if (today.getMonthValue() == 12 && today.getDayOfMonth() > 24) {
            nextChristmas = nextChristmas.plusYears(1);
        }

        LocalDate tillChristmas = LocalDate.of(today.getYear(), 12, 24);
        long result = ChronoUnit.DAYS.between(today, tillChristmas);
        String a = "It's just " + result + " to Christmas Eve !";
        String b = "Time to by gifts";
        System.out.println(result);
        System.out.println(a);

        if (result <= 60) {
            System.out.println(b);
        }

    }


    public void minutesToEndOfClass() throws InterruptedException {
            long minutesLeft;
        LocalTime timeToEndOfClass = LocalTime.of(16, 0);

        do {
            LocalTime now = LocalTime.now();
            minutesLeft = ChronoUnit.MINUTES.between(now, timeToEndOfClass);

            Thread.sleep(60000);
            System.out.println("There is " + minutesLeft + " minutes left to the end of today class");
        } while (minutesLeft >= 0);


    }


}
