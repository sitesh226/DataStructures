package Arrays;
/*
*Input 1:
*  A = [1, 2, 5, -7, 2, 3]
*Output 1:
* [1, 2, 5]
* Explanation 1:
* The two sub-arrays are [1, 2, 5] [2, 3].
*   The answer is [1, 2, 5] as its sum is larger than [2, 3].
*
*
 */

import java.util.ArrayList;

public class MaxNonNegativeSubArray {

    private static ArrayList<Integer> getMaxNonNegativeSubArray(ArrayList<Integer> arr){

        ArrayList<Integer> result=new ArrayList<>();
        ArrayList<Integer> copy=new ArrayList<>();
        int sum=0;
        int temp=0;
        for(Integer i:arr){
            if(i>=0){
                temp=temp+i;
                copy.add(i);

                if(temp>sum){
                    sum=temp;
                    result.clear();
                    result.addAll(copy);
                }


            }else{
                temp=0;
                copy.clear();
            }

//            if(temp>sum){
//                sum=temp;
//                result.clear();
//                result.addAll(copy);
//            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(-1);
        arr.add(200);
        arr.add(300);
        arr.add(-4);
        arr.add(100);
        arr.add(200);
        System.out.println("Max Non negative subarray:"+getMaxNonNegativeSubArray(arr));
    }
}
