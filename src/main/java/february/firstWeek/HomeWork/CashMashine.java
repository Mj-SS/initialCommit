package february.firstWeek.HomeWork;

public class CashMashine {

    public static int billCounter(int cashSum) {
        int billCount = 0;
        for (int i = 0; i < 6; i++){
            int a = 0;
            switch (i){
                case 0:
                    a = cashSum / 500;
                    cashSum -= a * 500;
                    billCount += a;
                    break;
                case 1:
                    a = cashSum / 200;
                    cashSum -= a * 200;
                    billCount += a;
                    break;
                case 2:
                    a = cashSum / 100;
                    cashSum -= a * 100;
                    billCount += a;
                    break;
                case 3:
                    a = cashSum / 50;
                    cashSum -= a * 50;
                    billCount += a;
                    break;
                case 4:
                    a = cashSum /20;
                    cashSum -= a * 20;
                    billCount += a;
                    break;
                case 5:
                    a = cashSum/ 10;
                    cashSum -= a * 10;
                    billCount += a;
                    break;
            }
        }
        return billCount;
    }
}

