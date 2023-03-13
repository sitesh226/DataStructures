package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


//
// An integer x is said to be Noble in arr[] if the number of integers greater than x is equal to x.
// If there are many Noble integers, return any of them. If there is no, then return -1.
//

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



    private static int getNobleIntegerUsingMap(int[] arr){

        Arrays.sort(arr);
        HashMap<Integer,Integer> mapOfElements=new HashMap<>();
        int i= arr.length-1;
        for (Integer a:arr) {
            mapOfElements.put(a, i--);
        }

        for (Integer val:mapOfElements.keySet()) {
            if(mapOfElements.get(val)==val)
                return val;
        }

        return -1 ;
    }

    public static void main(String[] args) {
        int [] arr = {10, 3, 20, 40, 2};
        System.out.println("Noble Integer in array:"+getNobleInteger(arr));
        System.out.println("Noble Integer in array using map:"+getNobleIntegerUsingMap(arr));

    }
}
