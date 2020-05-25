package Arrays;

import java.util.Arrays;

public class NobleIntegerInArray {

    private static int getNobleInteger(int[] arr){
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
                continue;//for duplicates

            if(arr[i]==arr.length-i-1)
                return arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {10, 3, 20, 40, 2};
        System.out.println("Noble Integer in array:"+getNobleInteger(arr));
    }
}
