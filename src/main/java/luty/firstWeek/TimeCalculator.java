package luty.firstWeek;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

//        Stwórz klasę TimeCalculator. Stwórz w niej metodę daysToChristmasEveInfo()
//        wyświetlają informację w konsoli z komunikatem: "It's just [ilość dni]to Christmas Eve!".
//        Jeżeli pozostało mniej jak 60 dni dodaj w nowej linii "Time to buy gifts".
//        Metoda ta niech woła kolejną metode daysToChristmasEve(LocalDate now) do
//        której przekażemy aktualną datę na
//        podstawie której zwróci wartość liczbową ilości dni pozostałych do najbliższej
//        Wigilii świąt Bożego Narodzenia. Spraw aby metoda była
//        uniwersalna - jak najbliższe święta miną, powinna nadal działać.
//        Pamiętaj również o końcówce roku. Użyj klasy LocalDate i jej metody now().
//        Dwie różne daty możesz porównać poprzez ChronoUnit.DAYS.between().
//        Przetestuj też z metody main samą metodę daysToChristmasEve przekazując
//        jej różne daty i drukując wynik.

//        Stwórz w TimeCalculator metodę minutesToEndOfClass().
//        Jej celem będzie wydrukowanie wiadomości "There is [ilość minut] minutes left to the end of today class".
//        Postaraj się zainspirować poprzednim zadaniem. Użyj jednak tym razem klasy LocalTime.
//        Następnie dodaj pętlę do while która będzie działała dopóki wartość ta
//        nie będzie wynosić 0, dodaj też w tej pętli Thread.sleep(5000) aby obliczenia i drukowanie były co 5 sekund.


public class TimeCalculator {

    public  void daysToChristmasEveInfo() {

        LocalDate today = LocalDate.now();
        daysToChristmasEve(today);

    }

    public  void daysToChristmasEve(LocalDate today ) {

        LocalDate nextChristmas = LocalDate.of(today.getYear(),12,24);

        if (today.getMonthValue() == 12 && today.getDayOfMonth() > 24){
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

    public void minutesToEndOfClass(){

        LocalTime timeToEndOfClass = LocalTime.of(16, 0, 0);


        String c = "There is" + [ilość minut] + " minutes left to the end of today class";
    }


}
