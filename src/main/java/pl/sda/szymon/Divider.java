package pl.sda.szymon;

public class Divider {
    public void main(String[] args) {
//        greatestCommonDivisor(55, 15);
        euclidesAlgo(55, 15);

    }

//    public static int greatestCommonDivisor(int a, int b) {}
//        if (a % b == 0) {
//            return b;
//        }
//        while (a % b != 0){
//            a = b;
//            b = (a % b);
//
//
//        return a;


    public int euclidesAlgo(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return euclidesAlgo(b, a % b);

        }
    }
}
