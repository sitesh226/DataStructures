package Arrays;

public class FindMissingNumberInArray {


    private static int getMissingNumber(int[] arr){
        int sum=0;


        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        System.out.println("Sum: "+sum);
        int size=arr.length+1;
        System.out.println("Size"+size);
        int sumOfNumber=(size*(size+1))/2;
        System.out.println(sumOfNumber);
        return sumOfNumber-sum;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        System.out.println("Missing num:"+getMissingNumber(arr));

    }
}
