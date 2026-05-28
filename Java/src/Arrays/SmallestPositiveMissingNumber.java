package Arrays;
/*
*
* Find the smallest positive number missing from an unsorted array
*
*Input:  {2, 3, 7, 6, 8, -1, -10, 15}
* Output: 1
*
* Input:  { 2, 3, -7, 6, 8, 1, -10, 15 }
* Output: 4
*
* Input: {1, 1, 0, -1, -2}
*  Output: 2
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SmallestPositiveMissingNumber {

    private static int  moveNegativesToFront(int[] arr ){
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return j;
    }

    private static int getMissingSmallestPositive(int[] arr){
        int negativesPosition=moveNegativesToFront(arr);
        int [] positiveArray=new int[arr.length-negativesPosition];

        int j=0;
        for(int i=negativesPosition;i<arr.length;i++){
            positiveArray[j]=arr[i];
            j++;
        }


        for(int k=0;k<positiveArray.length;k++){
            int x=Math.abs(positiveArray[k]);
            if(x-1<positiveArray.length&&positiveArray[x-1]>0){
                positiveArray[x-1]=-positiveArray[x-1];
            }
        }

        //First positive number index is the first positive missing numbers
        for(int z=0;z<positiveArray.length;z++){
            if(positiveArray[z]>0){
                return z+1;
            }
        }

        return positiveArray.length+1;

    }


    private static int getMissingSmallestPositive2(int[] arr){
        int negativesPosition=moveNegativesToFront(arr);
        int [] positiveArray=new int[arr.length-negativesPosition];

        int j=0;
        for(int i=negativesPosition;i<arr.length;i++){
            positiveArray[j]=arr[i];
            j++;
        }

        List<Integer> list=  Arrays.stream(positiveArray).boxed().collect(Collectors.toList());

        int smallestPositive= Integer.MAX_VALUE;
        int k=0;
        for(int i=1;i<=positiveArray.length;i++){
            if(list.contains(i))
                k++;
            else {
                smallestPositive = i;
                break;
            }

        }
        return smallestPositive;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, -7, 6, 8, 1, -10, 15 };
//        System.out.println("First missing positive: "+ getMissingSmallestPositive(arr));
        System.out.println("First missing positive: "+ getMissingSmallestPositive2(arr));
    }
}
