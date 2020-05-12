package Arrays;

public class MaxSumSubArrayUsingKadaneAlgo {

    private static int getMaxSubSubArray(int[] arr){

        int maxSoFar=arr[0];
        int currentSum=arr[0];

        for(int i=0;i<arr.length-1;i++){

            currentSum=Math.max(currentSum,currentSum+arr[i]);
            maxSoFar=Math.max(currentSum,maxSoFar);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int [] arr={ 1, 8, -3, -7, 2, 7, -1, 9 };
        System.out.println("Get max sum subarray:"+ getMaxSubSubArray(arr));

    }

}
