package LinkedList;

public class NthElementFromEnd {
    private static Node head;

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public void printList(){
        System.out.print("Linked list : ");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
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

    public Node getNthElementFromEnd(int n){
        Node fastPointer=head;
        Node slowPointer=head;
        int i=0;
        while(i<n){
            fastPointer=fastPointer.next;
            i++;
        }

        while(fastPointer!=null){
            fastPointer=fastPointer.next;
            slowPointer=slowPointer.next;
        }
        return slowPointer;
    }

    public boolean isLoopExist(){
        Node fastPointer=head;
        Node slowPointer=head;
        while(fastPointer!=null && fastPointer.next!=null){
            fastPointer=fastPointer.next.next;
            slowPointer=slowPointer.next;
            if(slowPointer==fastPointer)
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        NthElementFromEnd elementFromEnd=new NthElementFromEnd();
        Node loopElement=new Node(30);
        elementFromEnd.addToLast(new Node(10));
        elementFromEnd.addToLast(new Node(20));
        elementFromEnd.addToLast(loopElement);
        elementFromEnd.addToLast(new Node(40));
        elementFromEnd.addToLast(new Node(50));
        elementFromEnd.addToLast(new Node(60));
        elementFromEnd.addToLast(loopElement);
        elementFromEnd.printList();
        System.out.println("3rd element from last :"+elementFromEnd.getNthElementFromEnd(3).data);
        System.out.println("Is loop exists in Linked list:"+elementFromEnd.isLoopExist());
    }

}
