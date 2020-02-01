package pl.sda.szymon;

import java.util.Scanner;

public class UnitConverter {

    public static int celsiusToFahrenheit(int ca) {
        double fa = 0;
        fa = (ca * 1.8) + 32;
        System.out.println(fa);
        return 0;
    }

    public static int fahrenheitToCalsius(int fa) {
        double ca = 0;
        ca = (fa - 32) / 1.8;
        System.out.println(ca);
        return 0;
    }

    public static int kilometresToMiles(int k) {
        double m = 0;
        m = k / 1.61;
        System.out.println(m);
        return 0;
    }

    public static int milesTokilometres(int m) {
        double k = 0;
        k = m * 1.61;
        System.out.println(k);
        return 0;
    }

    public static int kiloToPounds(int kg){
        double ps = 0;
        ps = kg * 2.2046;
        System.out.println(ps);
        return 0;
    }
    public static int PoundsToKilos(int ps){
        double kg = 0;
        kg = ps / 2.2046;
        System.out.println(kg);
        return 0;
    }

}

