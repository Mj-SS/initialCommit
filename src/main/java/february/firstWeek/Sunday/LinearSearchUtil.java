package february.firstWeek.Sunday;

public class LinearSearchUtil {

    public static int findFirstSoftDrink(SoftDrink searchedDrinks, SoftDrink[] arr){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(searchedDrinks)){
                return i;
            }
        }


        return -1;
    }

}
