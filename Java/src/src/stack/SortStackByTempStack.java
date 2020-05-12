package stack;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Stack;

public class SortStackByTempStack {

    public static Stack<Integer> sortStack(Stack<Integer> inputstack){

        Stack<Integer> tempStack=new Stack<>();
        while(!inputstack.isEmpty()){
            int temp=inputstack.pop();

            while(!tempStack.isEmpty()&&tempStack.peek()>temp){
                inputstack.push(tempStack.pop());
            }

            tempStack.push(temp);
        }
        return tempStack;
    }

    public static void main(String [] args){
        Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        System.out.println("Before sorting stack is: "+ input);

        // This is the temporary stack
        Stack<Integer> tmpStack=sortStack(input);
        System.out.println("Sorted stack is:"+tmpStack);
        
//        ArrayList bb=new ArrayList();
//        bb.add("aaa");
//        bb.add("aaa");
//        bb.add("bbb");
//        
//        ArrayList aa=new ArrayList(new LinkedHashSet(bb));
//        for(Object a: aa) {
//        	System.out.println(a);
        

    }
}
