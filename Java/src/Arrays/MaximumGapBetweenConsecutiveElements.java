package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
*   Given an unsorted array, find the maximum difference between the successive elements in its sorted form.
* Try to solve it in linear time/space.
* Example :
* Input : [1, 10, 5]
* Output : 5
*
 */
public class MaximumGapBetweenConsecutiveElements {

    private static int getMaximumGapBetweenConsecutiveElements(List<Integer> arr){
        int gap=0;
        if(arr.size()<2)
            return 0;

        Set<Integer> arrayTreeSet=new TreeSet<>(arr);

        int i=0;
        int prev=-1;
        for (Integer current:arrayTreeSet){
            if(i==0){
                prev=current;
                i++;
            }else{
                gap=Math.max(gap,current-prev);
                prev=current;
            }
        }
        return gap;
    }

    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        array.add(1);
        array.add(10);
        array.add(5);
        array.add(7);
        array.add(17);
        System.out.println("Maximum consecutive gap:"+ getMaximumGapBetweenConsecutiveElements(array));
    }
}
