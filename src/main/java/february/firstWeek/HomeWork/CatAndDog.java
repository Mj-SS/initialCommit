package february.firstWeek.HomeWork;

public class CatAndDog {


    public static long yearConverter(int hy) {

        int cy = 0;


        for (int i = 1; i < hy; i++) {
            if (i == 1) {
                cy += 15;
            } else if (i == 2) {
                cy += 9;
            } else if (i > 3) {
                cy += 4;
            }

        }

        return cy;
    }

    public static long converterYear(int hyy) {

        int dy = 0;

        for (int j = 1; j < hyy; j++) {
            if (j == 1) {
                dy += 15;
            } else if (j == 2) {
                dy += 9;
            } else if (j > 3) {
                dy += 5;
            }

        }

        return dy;
    }

//    public static void main(String[] args) {
//        System.out.println(yearConverter(10));
//        System.out.println(converterYear(10));
//    }
}

