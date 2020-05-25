package Arrays;

import java.util.HashMap;

public class FindRepeatingAndMissingNumber {

    private static void getRepeatingAndMissingNumber(int arr[]){
        HashMap<Integer,Boolean> map=new HashMap<>();

        for(int i:arr){
            if(map.get(i)==null)
                map.put(i,true);
            else{
                System.out.println("Repeating number is:"+ i);
            }
        }

        int max=arr.length;

        for(int i=1;i<max;i++){
            if(map.get(i)==null){
                System.out.println("Missing number is:  "+ i);
                break;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 2, 1, 1 };
        getRepeatingAndMissingNumber(arr);
    }
}
