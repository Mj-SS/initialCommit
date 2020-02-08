package fwbeurary.secondWeek.Saturday;

import java.util.Arrays;
import java.util.List;

public class App2 {

    public static void main(String[] args) {

            List<Integer> integerList = Arrays.asList(-125, -100, -14, 5, 62, 35, -17, 1, 900, 554, -724, 92, 15, 178, -42, 62, -31, 8, 46, 41);

            IntegerService.printStatistics(integerList);
            IntegerService.printAllStatistics(integerList);

    }
}