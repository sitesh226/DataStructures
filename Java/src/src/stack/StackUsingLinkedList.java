package stack;

public class StackUsingLinkedList {

    private Node head;

    private class Node{
        int value;
        Node next;
    }

    StackUsingLinkedList(){
        head=null;
    }

    public int pop() throws LinkedListEmptyException{
            if(head==null){
                throw new LinkedListEmptyException("Linked list empty");
            }else{
                int poppedValue=head.value;
                head=head.next;
                return poppedValue;
            }
    }

    public void push(int value){
        Node oldHead=head;
        head=new Node();
        head.value=value;
        head.next=oldHead;
    }

    public void printList(Node head){
        Node temp=head;
        System.out.print("Elements in stack: ");
        while(temp!=null){
            System.out.print("  "+temp.value);
            temp=temp.next;
        }
        System.out.println();
    }
    public  static void main(String[] args) throws LinkedListEmptyException {
        StackUsingLinkedList stackUsingLinkedList=new StackUsingLinkedList();
        stackUsingLinkedList.push(10);
        stackUsingLinkedList.push(20);
        stackUsingLinkedList.push(30);
        stackUsingLinkedList.push(40);
        stackUsingLinkedList.push(50);
        stackUsingLinkedList.printList(stackUsingLinkedList.head);
        stackUsingLinkedList.pop();
        stackUsingLinkedList.pop();
        stackUsingLinkedList.printList(stackUsingLinkedList.head);
    }


}

 class LinkedListEmptyException extends Exception {
    public LinkedListEmptyException() {
        super();
    }

    public LinkedListEmptyException(String message) {
        super(message);
    }
}

