package Arrays;

/*
*
* Given an array arr[], find the maximum j – i such that arr[j] > arr[i]
 *
 */

public class MaxDistanceInArray {

    private static int maxDifference(int[] arr){
        int size=arr.length;
        int[] LMin=new int[size];
        int[] RMax=new int[size];

        //Lmin[i] will be smallest value from arr[0] to arr[i]
        LMin[0]=arr[0];
        for (int i=1;i<size;i++){
            LMin[i]=Math.min(arr[i],LMin[i-1]);
        }

        //RMax[j] will be max value from arr[j] t0 arr[size-1]
        RMax[size-1]=arr[size-1];
        for(int j=size-2;j>=0;j--){
            RMax[j]=Math.max(arr[j],RMax[j+1]);
        }

        int i=0;
        int j=0;
        int maxDiff=-1;
        while(i<size&&j<size){
            if(LMin[i]<RMax[j]){
                maxDiff=Math.max(maxDiff,j-i);
                j++;
            }else{
                i++;
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int arr[] = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
        System.out.println("Maximum difference j-i such that arr[j]>=arr[i]:  "+maxDifference(arr));
    }
}
