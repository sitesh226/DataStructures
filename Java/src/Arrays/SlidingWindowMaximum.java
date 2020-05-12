package Arrays;

import java.util.Stack;

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
     //   int [] result=getSlidingWindowMaximunUsingStack(arr,3);
        System.out.println("Sliding window max using array:");
        for(int i: result){
            System.out.print(i+" ");
        }
    }
}
