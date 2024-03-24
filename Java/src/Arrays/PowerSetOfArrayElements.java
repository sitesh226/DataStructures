package Arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PowerSetOfArrayElements {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subsetsHelper(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void subsetsHelper(List<List<Integer>> list , List<Integer> resultList, int [] nums, int start){
        list.add(new ArrayList<>(resultList));
        for(int i = start; i < nums.length; i++){
            // add element
            resultList.add(nums[i]);
            // Explore
            subsetsHelper(list, resultList, nums, i + 1);
            // remove
            resultList.remove(resultList.size() - 1);
        }
    }

/*
*Solution is like 0/1 knapsack problem , where for element we have two choices either to consider it or reject it
*
* Complexity:
* We are doubling the number of operations we do every time we decide to add another element to the original array.
* For example, let us say we only have the empty set {}. What happens to the power set if we want to add {a}?
* We would then have 2 sets: {}, {a}.
* What if we wanted to add {b}? We would then have 4 sets: {}, {a}, {b}, {ab}.
*Notice 2^n also implies a doubling nature. 2^1 = 2, 2^2 = 4, 2^3 = 8
*
*
 */
    public static void generatePowerSet(int[] arr, Deque<Integer> set,int n){

        //if we have considered all elements then return
        if(n==0) {
            System.out.println(set);
            return ;
        }


        //consider the nth element
        set.addLast(arr[n - 1]);
        generatePowerSet(arr, set, n - 1);

        //or don't consider the nth element
        set.removeLast();
        generatePowerSet(arr, set, n - 1);



    }


    public static void main(String[] args) {

        PowerSetOfArrayElements soa= new PowerSetOfArrayElements();
    //    int[] nums= {1, 2, 3, 4, 5};
      int[] nums= {1, 2,3};
//        List<List<Integer>> subsets = soa.subsets(nums);
//
//        for (List<Integer> subset: subsets) {
//            System.out.println(subset);
 //       }

        Deque<Integer> set=new ArrayDeque<>();
        generatePowerSet(nums,set,nums.length);



    }
}
