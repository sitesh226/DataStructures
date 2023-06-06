package Arrays;

import java.util.Stack;
//Given an array arr of size N and an integer K, the task is to find the maximum for each and every contiguous subarray of size K.
//
//        Examples:
//
//        Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3
//        Output: 3 3 4 5 5 5 6
//        All contiguous subarrays of size k are
//        {1, 2, 3} => 3
//        {2, 3, 1} => 3
//        {3, 1, 4} => 4
//        {1, 4, 5} => 5
//        {4, 5, 2} => 5
//        {5, 2, 3} => 5
//        {2, 3, 6} => 6

public class SlidingWindowMaximum {
    /*
    * Complexity of this solution is O(n*k)
     */

    public static int[] getSlidingWindowMaxiumUsingArray(int[] arr,int k){
        int[] result=new int[arr.length-k+1];
        int resultIndex=0;

        for(int i=k;i<=arr.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i-k;j<i;j++){
               max= Math.max(max,arr[j]);
            }
            result[resultIndex++]=max;
        }

        return  result;
    }


    public static int[] getSlidingWindowMaxiumUsingArray2(int[] arr,int k){
        int[] result=new int[arr.length-k+1];
        int resultIndex=0;

        for(int i=0;i<=arr.length-k;i++){

            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max= Math.max(max,arr[j]);
            }
            result[resultIndex++]=max;
        }
        return  result;
    }




    public static int[] getSlidingWindowMaximunUsingStack(int [] arr, int k){
        int result[]=new int[arr.length];
        int l=0;
        Stack<Integer> stk=new Stack<>() ;
        stk.push(arr[0]);
        for(int i=1;i<arr.length-1;i++){

            int j=0;
            while(!stk.isEmpty()&&j<k){
                if(stk.peek()<arr[i]){

                    stk.pop();
                    stk.push(arr[i]);
                    i++;
                }
                j++;
            result[l++]=stk.pop();
            }
        }
        return result;
    }


    public static void main(String[] args){
        int[] arr={2,6,-1,2,4,1,-6,5};
        int [] result=getSlidingWindowMaxiumUsingArray(arr,3);
       // int [] result=getSlidingWindowMaximunUsingStack(arr,3);
        System.out.println("Sliding window max using array:");
        for(int i: result){
            System.out.print(i+" ");
        }

        System.out.println();

        int [] result1=getSlidingWindowMaxiumUsingArray2(arr,3);
        // int [] result=getSlidingWindowMaximunUsingStack(arr,3);
        System.out.println("Sliding window max using array sol 2 :");
        for(int i: result1){
            System.out.print(i+" ");
        }
    }
}
