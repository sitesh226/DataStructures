package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
*Given a list of non-negative integers, arrange them such that they form the largest number.
*For example:
*Given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 */
public class GetLargestPossibleNumberByArrayElements {

    private static String getLargestNumber(List<Integer> list){
        List<String> stringList=list.stream().map(String::valueOf).collect(Collectors.toList());

        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String X, String Y) {
                String XY=X+Y;
                String YX=Y+X;
               return XY.compareTo(YX)>0?-1:1;
            }
        });

        System.out.println("List after sorting : "+stringList);
        StringBuilder result=new StringBuilder("");
        for(String s:stringList){
            result.append(s);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        List<Integer> input=new ArrayList<>();
        input.add(9);
        input.add(30);
        input.add(34);
        input.add(5);
        input.add(3);
        System.out.println("input list : "+input);
        System.out.println("Largest number "+ getLargestNumber(input));
    }
}
