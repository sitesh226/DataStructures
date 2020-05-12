package LinkedList;

public class ReverseLinkedListInPairs {

    private Node head;

    private static class Node{
        Node next;
        int value;
        Node(int value){
            this.value=value;
        }
    }

    public void addToLast(Node node){
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }

    public void printLinkedList(Node head){
        System.out.print("Linked list : ");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"  ");
            temp=temp.next;
        }
        System.out.println();
    }

    public Node reverseLinkedListInPairs(Node head){
        Node current=head;
        Node temp=null;
        Node newHead=null;
        while(current!=null && current.next!=null){

            if(temp!=null){
                temp.next.next=current.next;
            }
            temp=current.next;
            current.next=temp.next;
            temp.next=current;
            current=current.next;
 

            if(newHead==null){
                newHead=temp;
            }

        }

        return newHead;
    }

    public static void main(String[] args) {
        ReverseLinkedListInPairs list = new ReverseLinkedListInPairs();
        // Creating a linked list
        Node head=new Node(5);
        list.addToLast(head);
        list.addToLast(new Node(6));
        list.addToLast(new Node(7));
        list.addToLast(new Node(1));
        list.addToLast(new Node(2));
        list.addToLast(new Node(8));

        list.printLinkedList(head);
        //Reversing LinkedList in pairs
        Node result=list.reverseLinkedListInPairs(head);
        System.out.println("After reversing in pair");
        list.printLinkedList(result);
    }

}
