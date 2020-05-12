package LinkedList;

public class CheckLoopInLinkedList {
    private static Node head;
    private static int loopPosition=0;

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }


    public void addToLast(Node node){
        if(head==null)
            head=node;
        else{
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;

            temp.next=node;
        }
    }


    public boolean isLoopExist(){
        Node fastPointer=head;
        Node slowPointer=head;
        while(fastPointer!=null && fastPointer.next!=null){
            fastPointer=fastPointer.next.next;
            slowPointer=slowPointer.next;
           // ++loopPosition;
            if(slowPointer!=fastPointer)
                ++loopPosition;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        CheckLoopInLinkedList checkLoop=new CheckLoopInLinkedList();
        Node loopElement=new Node(30);
        checkLoop.addToLast(new Node(10));
        checkLoop.addToLast(new Node(20));
        checkLoop.addToLast(loopElement);
        checkLoop.addToLast(new Node(40));
        checkLoop.addToLast(new Node(50));
        checkLoop.addToLast(new Node(60));
        checkLoop.addToLast(loopElement);
        System.out.println("Is loop exists in Linked list:"+checkLoop.isLoopExist());
        System.out.println("Loop Exists at position:"+loopPosition);
    }

}
