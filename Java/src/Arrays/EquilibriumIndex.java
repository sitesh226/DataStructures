package Arrays;

/*
*Equilibrium index of an array is an index such that
*the sum of elements at lower indexes is equal to the sum of elements at higher indexes
 */

public class EquilibriumIndex {

    private static int getEquilibriumIndex(int[] arr){
        int sum=0;
        int leftSum=0;

        for(int i: arr){
            sum+=i;
        }

        for(int j=0;j<=arr.length-1;j++){
            sum=sum-arr[j]; //Gives sum of elements to right of current index

            if(leftSum==sum)
                return j;

            leftSum=leftSum+arr[j];
        }
        return -1; //no equilibrium index
    }

    public static void main(String[] args) {
        int [] arr={ -7, 1, 5, 2, -4, 3, 0 };
        System.out.println("Get equilibrium Index: "+ getEquilibriumIndex(arr));
    }


}
