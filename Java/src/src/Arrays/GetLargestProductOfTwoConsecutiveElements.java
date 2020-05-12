package Arrays;

public class GetLargestProductOfTwoConsecutiveElements {

    private static int getLargestProduct(int[] arr){

        int maxSoFar=0;
        for(int i=1;i<arr.length;i++){
            int temp=arr[i]*arr[i-1];
            if(maxSoFar<temp)
                maxSoFar=temp;
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int [] arr={2,3,4,1,8};
        System.out.println("Max consecutive element product:"+ getLargestProduct(arr));
    }
}
