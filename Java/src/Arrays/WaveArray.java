package Arrays;
/*
*Given an array of integers, sort the array into a wave like array and return it,
* In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....
*
 */

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {


    private static void waveArray(ArrayList<Integer> arr){
        Collections.sort(arr);
        for(int i=0;i<arr.size();i=i+2){
            int temp=arr.get(i);
            arr.set(i,arr.get(i+1));
            arr.set(i+1,temp);
        }

        System.out.println("Arraylist after change: "+ arr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println("Initial array:"+ arr);
        waveArray(arr);
    }
}




