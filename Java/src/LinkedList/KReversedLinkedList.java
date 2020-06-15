package LinkedList;

/*
* Given a linked list and an integer k , reverse the list in groups of k
 */
public class KReversedLinkedList {

    private static Node head;

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

        public  void addToLast(Node node) {
            if (head == null)
                head = node;
            else {
                Node temp = head;
                while (temp.next != null)
                    temp = temp.next;

                temp.next = node;
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
    }

    //1-2-3-4-5-6
    private static Node reverseLinkedListInGroupsOfK(Node head,int k){
        Node current=head;
        Node next=null;
        Node prev=null;
        int count =0;
        while(count<k&&current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            count++;
        }

        if(next!=null)
            head.next=reverseLinkedListInGroupsOfK(next,k);

        return prev;

    }

    public static void main(String[] args) {
        KReversedLinkedList kReversedLinkedList=new KReversedLinkedList();
        KReversedLinkedList.Node node=new KReversedLinkedList.Node(0);
        node.addToLast(new Node(1));
        node.addToLast(new Node(2));
        node.addToLast(new Node(3));
        node.addToLast(new Node(4));
        node.addToLast(new Node(5));
        node.addToLast(new Node(6));
        node.printList();
        head=KReversedLinkedList.reverseLinkedListInGroupsOfK(head,3);
        node.printList();

    }
}
