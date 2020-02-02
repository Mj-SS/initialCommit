package february.firstWeek.Sunday;

public class BinarySearch {

    public static int search(int searchedElement,
                             int[] arr,
                             int lowIndex,
                             int highIndex) {

        int middleIndex = (lowIndex + highIndex) / 2;
        int middleElement = arr[middleIndex];
        if (searchedElement == arr[middleElement]) {
            return middleIndex;
        } else if (searchedElement < arr[middleElement]) {
           return search(searchedElement, arr, lowIndex, middleIndex - 1);
        } else if (searchedElement > arr[middleElement]) {
           return search(searchedElement, arr, middleIndex + 1, highIndex);
        }else {
            return -1;
        }
    }

}
