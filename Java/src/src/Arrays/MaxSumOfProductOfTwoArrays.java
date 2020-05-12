package Arrays;
import java.util.*;

public class MaxSumOfProductOfTwoArrays {

    private static int getMaxSumOfProductOfTwoArrays(int[] arr1,int[] arr2){
        int sum=0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0;i<=arr1.length-1;i++){
            sum=sum+arr1[i]*arr2[i];
        }

        return sum;
    }


    public static void main(String[] args){
        int[] A = { 1, 2, 3 };
        int[] B = { 4, 5, 1 };

        System.out.println("Max Sum product of arrays:"+getMaxSumOfProductOfTwoArrays(A,B));
    }
}
