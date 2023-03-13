package Arrays;

public class DuplicateInArray {

    public  static int repeatedNumber(int [] a ) {
        int[] arr = new int[a.length];


        for(int num : a) {
            arr[num-1]++; //Set array value to 1.
            if (arr[num-1] > 1) {
                return num;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int [] arr={3,5,1,4,1};
        System.out.println(repeatedNumber(arr));
    }
}
