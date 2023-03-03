package Arrays;

//
//Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
//        has the largest sum and returns its sum and prints the subarray.
public class MaxSumSubArrayUsingKadaneAlgo {

    private static int getMaxSubSubArray(int[] arr){

        int maxSoFar=arr[0];
        int currentSum=arr[0];

        for(int i=1;i<arr.length;i++){

            currentSum=Math.max(arr[i],currentSum+arr[i]);
            maxSoFar=Math.max(currentSum,maxSoFar);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int [] arr={ 1, 8, -3, -7, 2, 7, -1, 2 };
        System.out.println("Get max sum subarray:"+ getMaxSubSubArray(arr));

    }

}
