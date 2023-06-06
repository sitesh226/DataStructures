package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArrayBasedOnLastDigitOfElements {

    public static void sortArrayBasedOnLastDigitOfElement(List<Integer> input){

        Collections.sort(input, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer o11=o1%10;
                Integer o22=o2%10;
             //   return o11.compareTo(o22)>0?1:-1;
                return o11.compareTo(o22); // Both of these statements are same . If conditional statement is not added that means we want to sort in ascending order.

            }
        });
//
//        //Usign Lambda above code would look like:
//        Collections.sort(input, (o1, o2) -> {
//            Integer o11=o1%10;
//            Integer o22=o2%10;
//            return o11.compareTo(o22);
//
//        });

        System.out.println("Array after sorting:"+ input);
    }



    public static void main(String[] args) {
        List<Integer> input=new ArrayList<>();
        input.add(311);
        input.add(30);
        input.add(34);
        input.add(5);
        input.add(9);

        sortArrayBasedOnLastDigitOfElement(input);
    }

}
