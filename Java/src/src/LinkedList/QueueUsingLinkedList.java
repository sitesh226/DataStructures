package LinkedList;

public class QueueUsingLinkedList {

    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    private static Node front=null;
    private static Node rear=null;
    private int queueCurrentSize=0;

    public void enqueue(int input){
        Node newNode=new Node(input);
        if(queueCurrentSize==0){
            rear=front=newNode;
        }

        else{
            Node temp=rear;
            temp.next=newNode;
            rear=newNode;
        }
        queueCurrentSize++;
    }


    public void printQueue(Node front) {
        if (front == null) {
            System.out.println("Queue Empty");
        } else {
            System.out.print("Queue: ");
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void dequeue(){
        if(queueCurrentSize==0){
            System.out.println("Queue Empty");
        }else{
            queueCurrentSize--;
            front=front.next;
        }
    }

    public static void main(String[] args){
        QueueUsingLinkedList queue=new QueueUsingLinkedList();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.printQueue(front);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.printQueue(front);
    }

}
