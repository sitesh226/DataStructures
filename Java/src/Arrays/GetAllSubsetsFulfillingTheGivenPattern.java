package Arrays;

/*
*
*
* Input : an int array [1,0,0,1,1,0,0,1,0,1,0,0,0,1]
you have to come up with a program that will give all possible subsets of the array based on the pattern.
Pattern restrictions are the string array should start with 1 and end with 1
 */

import java.util.ArrayList;
import java.util.List;

public class GetAllSubsetsFulfillingTheGivenPattern {

    private static List<List<Integer>> getAllSubsets(int [] arr){
        List<List<Integer>> list=new ArrayList<>();
        subsetHelper(list,new ArrayList<>(),arr,0);
        return list;
    }

    private static void subsetHelper(List<List<Integer>> list,List<Integer> resultList,int [] arr, int start){
        list.add(resultList);
        for (int i=start;i<arr.length;i++){
            resultList.add(arr[i]);
            subsetHelper(list,resultList,arr,i+1);
            resultList.remove(resultList.size()-1);
        }
    }

    private static List<List<Integer>> getSubsetsFulfillingPattern(List<List<Integer>> list){
        List<List<Integer>> resultSubsets=new ArrayList<>();
        for(List list1:list){
            if(list1.size()>=2&&list1.get(0).equals(1)&&list1.get(list1.size()-1).equals(1)) {
                resultSubsets.add(list1);
                System.out.println(list1);
            }
        }
        return resultSubsets;
    }



    public static void main(String[] args) {
       // int [] arr={1,0,0,1,1,0,0,1,0,1,0,0,0,1};
        int [] arr={1,0,0,1};
        List<List<Integer>> subsets=getAllSubsets(arr);
        getSubsetsFulfillingPattern(subsets);
    }
}


