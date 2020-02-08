package fwbeurary.secondWeek.Saturday;

import java.util.*;

public class IntegerService {


    public static void printStatistics(List<Integer> intList) {

       int sum = intList.stream().mapToInt( i -> i).sum();

        System.out.println("sum on elements is: "+ sum);
        OptionalDouble average = intList.stream().mapToInt(i -> i).average();
        double averageAsDouble = average.getAsDouble();
        System.out.println("avarage of elements is: " +averageAsDouble);
    }

    public static void  printAllStatistics(List<Integer> intList){
        IntSummaryStatistics summary = intList.stream()
                .mapToInt(x -> x)
                .summaryStatistics();
        System.out.println(summary.toString());
    }

}
