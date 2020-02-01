package february.firstWeek.Saturday;

public class BubbleSort {

//    I sposób

    public static void sort(int[] tab) {

//        boolean swapped;
//        do {
//            swapped = false;
//            for (int i = 1; i < tab.length; i++) {
//                int leftObject = tab[i - 1];
//                int rightObject = tab[i];
//                if (leftObject > rightObject) {
//                    int temp = leftObject;
//                    tab[i - 1] = tab[i];
//                    tab[i] = temp;
//                    swapped = true;
//                }
//            }
//        } while (swapped);

//        II sposób

        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < tab.length; i++) {

                if (tab[i - 1] > tab[i]) {
                    int temp = tab[i - 1];
                    tab[i - 1] = tab[i];
                    tab[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);


    }

}
