package Arrays;

/*
*
* Given an array where difference between adjacent elements is 1,
* write an algorithm to search for an element in the array and return the position of the element (return the first occurrence).
 */
public class SearchInArrayHavingDifferenceBetweenAdjacentElementsAsOne {

    private static int searchElement(int[] arr, int element) {

        int i=0;
        while(i<arr.length){
            if(arr[i]==element)
                return i;

            i=i+ Math.abs(arr[i]-element);
        }

        System.out.println ("number is not" +
                " present!");
        return -1;

    }

    public static void main(String[] args) {
        int [] arr= {8, 7, 6, 7, 6, 5, 4, 3, 2, 3, 4, 3};
        System.out.println("Search Element found at index:  " + searchElement(arr,3));
    }



}
