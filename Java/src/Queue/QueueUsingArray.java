package Queue;

public class QueueUsingArray {


    private int capacity;
    int[] queue;
    int front,rear,currentSize=0;

    public QueueUsingArray(int size){
        this.capacity=size;
        front=0;
        rear=-1;
        queue=new int[capacity];
    }

    public boolean isFull(){
        if(currentSize==capacity)
            return true;
        else
            return false;
    }

    public boolean isEmpty(){

        if (currentSize == 0){
            return true;
        }
        return false;
    }

    public void  enqueue(int a){
        if(isFull()){
            System.out.println("Queue is full!! Can not add more elements");
        }else{
            rear++;
//            if(rear==capacity-1){
//               // rear=0;
//            }
            queue[rear]=a;
            currentSize++;
          //  System.out.println(a+ " added to the queue");
        }
    }

    public void dequeue(){
        System.out.println();
        if(isEmpty())
            System.out.println("Queue is empty cannot delete elements");
        else {
            front++;
//            if (front == capacity - 1) {
//                front = 0;
//                System.out.println(queue[front - 1] + " removed from the queue");
//            } else {
                System.out.println(queue[front - 1] + " removed from the queue");
//            }
            currentSize--;
        }


    }

    public void printQueueElements(){
        System.out.print("Queue is: ");

        for(int a: queue){
            System.out.print(a+"  ");
        }

    }


    public static void main(String a[]){

        QueueUsingArray queue = new QueueUsingArray(5);
        queue.enqueue(6);
        queue.enqueue(3);
        queue.enqueue(99);
        queue.enqueue(56);
        queue.enqueue(43);
//        queue.enqueue(89);
//        queue.enqueue(77);
//        queue.enqueue(32);
        queue.printQueueElements();
        queue.dequeue();
        queue.printQueueElements();
    }

}
