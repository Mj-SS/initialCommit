package pl.sda.szymon;


public class PseudocodeExerciseImpl {
    public static void main(String[] args) {
        getMax();
        evenNumbers();
        getEven();

    }

    //    sposób 1
    public int highestValue(int[] arr) {
        int higest = arr[0];
        for (int i : arr) {
            if (i > higest) {
                higest = i;
            }
        }
        return higest;
    }

    // sposób 2
    public static int getMax() {
        int[] tab = new int[]{16, 23, 3, 14, 11, 6, 7, 8, 43, 21};
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        System.out.println(max);
        return max;
    }

    public static void evenNumbers() {
        int[] tab = new int[]{16, 23, 3, 14, 11, 6, 7, 8, 43, 21};
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {

            }
        }
    }

    public static void getEven() {
        int[] tab = new int[]{16, 23, 3, 14, 11, 6, 7, 8, 43, 21};
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
            sum += tab[i];
            }

        }
    }
}