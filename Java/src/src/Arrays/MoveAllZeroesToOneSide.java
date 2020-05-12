package Arrays;

public class MoveAllZeroesToOneSide {

    private static void moveAllZeroesToRight(int[] arr){
        int count=0;

        for(int i:arr){
            if(!(i==0)){
                arr[count++]=i;
            }
        }
        while(count<arr.length){
            arr[count++]=0;
        }
        System.out.print("Array after rearranging 0's to right:  ");
        for(int j:arr){
            System.out.print(j+ "  ");

        }
    }

    private static void  moveAllZeroesToLeft(int[] arr){
        int countOfZeroes=arr.length-1;

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                arr[countOfZeroes--]=arr[i];
            }
        }
        while(countOfZeroes>=0){
            arr[countOfZeroes--]=0;
        }

        System.out.println();
        System.out.print("Array after rearranging 0's to left :  ");
        for(int j:arr){
            System.out.print(j+ "  ");

        }

    }


    public static void main(String[] args) {
        int [] arr={1,2,0,4,0,5,0,7,9,0};
        moveAllZeroesToRight(arr);
        moveAllZeroesToLeft(arr);

    }
}
