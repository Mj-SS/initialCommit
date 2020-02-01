package luty.firstWeek;

import java.time.LocalDate;



public class TC {

    public static void main(String[] args) {
        TimeCalculator calculator = new TimeCalculator();
        calculator.daysToChristmasEveInfo();
        calculator.daysToChristmasEve(LocalDate.of(2020, 12, 24));
    }

}
