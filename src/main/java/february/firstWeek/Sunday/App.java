package february.firstWeek.Sunday;

import february.firstWeek.Saturday.BubbleSort;

import java.util.Arrays;

import static february.firstWeek.Sunday.QuickSort.sort;

public class App {

    public static void main(String[] args) {

        int [] tabOne = {12, 5, 3, 5, 6, 3, 353, 42};
        int [] tabTwo = {12, -5, 3, 5, 2332, 13, 353, 42, 55, 6666, 34};
        System.out.println("tabOne ");
        System.out.println(Arrays.toString(tabOne));
        QuickSort.sort(tabOne);
        System.out.println(Arrays.toString(tabOne));

        System.out.println("tabTwo");
        System.out.println(Arrays.toString(tabTwo));
        QuickSort.sort(tabTwo);
        System.out.println(Arrays.toString(tabTwo));

    }

}
