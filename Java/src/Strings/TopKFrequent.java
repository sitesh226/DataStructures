package Strings;

import java.util.*;

public class TopKFrequent {

    public static void topK(int[] nums, int k) {

        // Count frequencies
        Map<Integer, Integer> freq = new HashMap<>();

       for(int num: nums){
           freq.put(num,freq.getOrDefault(num,0)+1);
       }


       //Convert to List so that we can use Collections.sort
        List<Map.Entry<Integer,Integer>> list= new ArrayList<>(freq.entrySet());

       Collections.sort(list,(e1,e2)->
               e2.getValue().compareTo(e1.getValue()));

       for(int i=0;i<k;i++){
           System.out.println(list.get(i).getKey()+ "--->"+list.get(i).getValue());
       }
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};

        topK(nums, 2);
    }
}