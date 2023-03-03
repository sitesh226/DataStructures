package Arrays;

public class ReverseArrayInSubsetsOfGivenN {

    private static void reverseArrayInSubsets(int [] arr,int N){



        for(int i=0;i<arr.length-1;i=i+N){

            int left=i;
            int right=i+N-1;
            if(right> arr.length)
                right= arr.length-1;

            while(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }

        System.out.println("\nArray after reversing in subsets of "+N+" :");
        for(int j:arr){
            System.out.print(j+ "  ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,3,5,2,6,7,8,9,12,17,54,67};
        System.out.println("Initial array :");
        for(int i: arr)
            System.out.print(i+"  ");
      //  reverseArrayInSubsets(arr,3);
        reverseArrayInSubsets(arr,5);
    }
}
