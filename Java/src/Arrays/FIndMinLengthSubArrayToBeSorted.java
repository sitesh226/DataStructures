package Arrays;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

/*
*Find the Minimum length Unsorted Subarray, sorting which makes the complete array sorted
*If the input array is [0, 1, 15, 25, 6, 7, 30, 40, 50], your program should be able to
*  find that the subarray lies between the indexes 2 and 5.
*
 */
public class FIndMinLengthSubArrayToBeSorted {

    private static void getMinLengthUnsortedArrayToBeSorted(int[] arr){

        int start=0;
        int end=arr.length-1;
        int min;
        int max;

        //Find element which is greater than next element.
        for( start=0;start<arr.length-1;start++){
            if(arr[start]>arr[start+1])
                break;
        }

        if(start==arr.length-1)
            System.out.println("Already sorted");

        for(end=arr.length-1;end>=0;end--){
            if(arr[end]<arr[end-1])
                break;
        }

        //get max and min in the array from start to end
        max=arr[start];
        min=arr[start];
        for(int i=start+1;i<=end;i++){
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }

        //Find element from 0th index to start which is greater  than min
        for(int i=0;i<start;i++){
            if(arr[i]>min) {
                start=i;
                break;
            }

        }

        //FInd element from last to end+1  index which is less than max
        for(int i=arr.length-1;i>=end+1;i--){
            if(arr[i]<max){
                end=i;
                break;
            }

        }

        System.out.println(" The unsorted sub array which makes the given array sorted lies between the indices "+start +" and "+end);

    }


    private static void getMinLengthUnsortedArrayToBeSortedSol2(int[] arr){
//        Declare a temporary array temp same as given array arr.
//        Sort the temporary array .
//        Initialize variable s with 0 and e with 0.
//        Checking the unequal element from start and storing it in s variable .
//        Checking the unequal element from end and storing it in e variable.
//        Returning (e-s+1) .
//         Printing the result .

        List<Integer> output = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(output);
        int start=0;
        int end=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=output.get(i)){
                start=i;
                break;
            }
        }

        for (int j=arr.length-1;j>=0;j--){
            if(arr[j]!=output.get(j)){
                end=j;
                break;
            }
        }
        System.out.println(" The unsorted sub array which makes the given array sorted lies between the indices "+start +" and "+end);

    }


    public static void main(String[] args) {
        int arr[] = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
//        getMinLengthUnsortedArrayToBeSorted(arr);
        getMinLengthUnsortedArrayToBeSortedSol2(arr);
    }


}
