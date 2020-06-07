package stack;

import java.util.ArrayList;
import java.util.Stack;

/*
*Given an array of integers, find the nearest smaller number for every element such that
* the smaller element is on left side.
 */
public class NearestSmallerElement {

    private static ArrayList<Integer> getNearestSmallerElementsInArray(ArrayList<Integer> input){
        ArrayList<Integer> result=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<input.size();i++){
            while(!stack.isEmpty()&&stack.peek()>=input.get(i))
                stack.pop();

            if(stack.isEmpty())
                result.add(-1);
            else
                result.add(stack.peek());

            stack.push(input.get(i));
        }


        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> input=new ArrayList<>();
        input.add(1);
        input.add(3);
        input.add(0);
        input.add(2);
        input.add(5);
        System.out.println("Nearest smallest element array: "+ getNearestSmallerElementsInArray(input));
    }
}
