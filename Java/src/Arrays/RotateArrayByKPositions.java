package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateArrayByKPositions {

    public static int[] rotateOptimized(int[] nums,int k)
    {
        int n=nums.length;
        if(k > n)
            k=k%n;

//
//        nums=reverse(nums,0,k-1);
//        nums=reverse(nums,k,n-1);
//        nums=reverse(nums,0,n-1);

        int [] result=new int[n];
        int j=0;
        for(int i=k;i<n;i++){
            result[j++]=nums[i];
        }

        for(int i=0;i<k;i++){
            result[j++]=nums[i];
        }

       // return nums;
        return result;
    }
    public static int[] reverse(int[] nums,int start,int end)
    {

        while (start <= end ) {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
//        int size = Integer.parseInt(input.readLine());
//        int k=Integer.parseInt(input.readLine());
//
//        int[] arr=new int[size];
//
//        String inputArrayString=input.readLine();//Input array with spaces
//        String[] inputArray=inputArrayString.split(" ");
//        for(int i=0;i<size;i++){
//            arr[i]=Integer.parseInt(inputArray[i]);
//        }

       // int [] arr={1,3,5,2,4};
        int [] arr={8,9,10,6,1,11,12};
      //  rotateOptimized(arr,k);
        int [] res=rotateOptimized(arr,4);
        System.out.println("RotatedArray:");
        for(int j:res){
            System.out.print(j+" ");
        }
    }
}
