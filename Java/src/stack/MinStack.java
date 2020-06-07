package stack;

import java.util.Stack;

/*
*Design a stack that supports push, pop, top, and retrieving the minimum element in constant time
 */
public class MinStack {

    public  Element top;

    public void push(int x){
        if(top==null){
            top=new Element(x,x);
        }else{
            Element e=new Element(x,Math.min(x,top.min));
            e.next=top;
            top=e;
        }
    }

    public void pop(){
        if(top==null)
            return;
        else{
            Element temp=top.next;
            top.next=null;
            top=temp;
        }
    }

    public int getTop(){
        if(top==null)
            return -1;
        else
            return top.value;
    }

    public int getMin(){
        if(top==null)
            return -1;
        else
            return top.min;
    }

    public void printStack(){
        System.out.print("Stack : ");
        Element temp=top;
        while(temp!=null) {
            System.out.print(temp.value + " ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(5);
        minStack.push(8);
        minStack.push(9);
        minStack.push(4);
        minStack.push(11);
        minStack.printStack();
        System.out.println("Minimum value: "+minStack.getMin());
        System.out.println("Top value: "+minStack.getTop());
        minStack.pop();
        System.out.println("Stack after pop");
        minStack.printStack();

    }

}


class Element{
    public int value;
    public int min;
    public Element next;

    public Element(int value,int min){
        this.value=value;
        this.min=min;
    }
}
