package Arrays;

/**
 * Given an array of size n,
 * the array contains numbers in range from 0 to k-1 where k is a positive integer and k <= n.
 * Find the maximum repeating number in this array.
 * For example, let k be 10 the given array be arr[] = {1, 2, 2, 2, 0, 2, 0, 2, 3, 8, 0, 9, 2, 3},
 * the maximum repeating number would be 2. Expected time complexity is O(n) and extra space allowed is O(1).
 * Modifications to array are allowed
 *
 *
 *
 *
 * Solution:
 * 1) Iterate though input array arr[], for every element arr[i], increment arr[arr[i]%k] by k (arr[] becomes {2, 11, 11, 29, 11, 12, 1, 15 })
 * 2) Find the maximum value in the modified array (maximum value is 29). Index of the maximum value is the maximum repeating element (index of 29 is 3).
 * 3) If we want to get the original array back, we can iterate through the array one more time and do arr[i] = arr[i] % k where i varies from 0 to n-1.
 */



public class MaxRepeatedNumberInAnArray {
    private static int getMaxRepeatedElement(int[] arr,int k){

        int resultIndex=-1;
        for(int i=0;i<arr.length;i++){
            arr[arr[i]%k]+=k;
        }

        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                resultIndex=i;
            }

        }

        //get the original array
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]%k;
        }
        return resultIndex;
    }

    public static void main(String[] args) {
        int [] arr={1, 2, 2, 2, 0, 2, 0, 2, 3, 8, 0, 9, 2, 3};
        System.out.println("Maximum repeated element : "+arr[getMaxRepeatedElement(arr,9)]);

    }


}
