package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {

    Queue<Integer> queue1,queue2;
    StackUsingTwoQueues(){
        queue1=new LinkedList<Integer>();
        queue2=new LinkedList<Integer>();
    }

    public void push(int pushedElement){
        if(queue1.size()==0){
            queue1.add(pushedElement);
        }else {
            int size=queue1.size();
            for (int i = 0; i < size; i++)
                queue2.add(queue1.remove());

            queue1.add(pushedElement);

            for(int j=0;j<size;j++)
                queue1.add(queue2.remove());

        }

    }



    public void pop() throws QueueEmptyException {
        if(queue1.size()==0){
            throw new QueueEmptyException("Underflow exception");
        }
        queue1.remove();
    }

    public void viewElements(){
        System.out.println("Stack elements: "+queue1);
    }

    public static void main(String[] args) throws QueueEmptyException {
        StackUsingTwoQueues stackUsingTwoQueues=new StackUsingTwoQueues();
        stackUsingTwoQueues.push(10);
        stackUsingTwoQueues.push(20);
        stackUsingTwoQueues.push(30);
        stackUsingTwoQueues.push(40);
        stackUsingTwoQueues.push(50);
        stackUsingTwoQueues.viewElements();
        stackUsingTwoQueues.pop();
        stackUsingTwoQueues.pop();
        stackUsingTwoQueues.viewElements();

    }


}
 class QueueEmptyException extends Throwable {
    public QueueEmptyException(String underflow_exception) {
        super(underflow_exception);
    }
}
