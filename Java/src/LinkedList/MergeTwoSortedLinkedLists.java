package LinkedList;

public class MergeTwoSortedLinkedLists {
    Node head;

    static class Node{
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


    public void printList(){
        System.out.print("Linked List: ");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node mergeSortedLinkedLists(Node head1,Node head2){
        Node dummyNode=new Node(0);
        Node tail=dummyNode;
        while(true){
            if(head1==null){
                tail.next=head2;
                break;
            }
            if (head2==null){
                tail.next=head1;
                break;
            }
            if(head1.data>=head2.data){
                tail.next=head2;
                head2=head2.next;
            }else {
                tail.next=head1;
                head1=head1.next;
            }
            tail=tail.next;
        }
        return dummyNode.next;
    }


    public static Node mergeSortedLinkedListsUsingRecursion(Node head1,Node head2){
        if(head1==null)
            return head2;
        if (head2==null)
            return head1;

        if(head1.data<head2.data){
            head1.next=mergeSortedLinkedListsUsingRecursion(head1.next,head2);
            return head1;
        }else {
            head2.next=mergeSortedLinkedListsUsingRecursion(head1,head2.next);
            return head2;
        }

    }





    public static void main(String[] args) {
        MergeTwoSortedLinkedLists list1=new MergeTwoSortedLinkedLists();
        MergeTwoSortedLinkedLists list2=new MergeTwoSortedLinkedLists();
        MergeTwoSortedLinkedLists list3=new MergeTwoSortedLinkedLists();
        MergeTwoSortedLinkedLists list4=new MergeTwoSortedLinkedLists();


        list1.addToLast(new Node(5));
        list1.addToLast(new Node(10));
        list1.addToLast(new Node(15));

        list2.addToLast(new Node(2));
        list2.addToLast(new Node(3));
        list2.addToLast(new Node(20));
        list1.printList();
        list2.printList();

//        Node mergedList =mergeSortedLinkedLists(list1.head,list2.head);
//        list3.addToLast(mergedList);
//        list3.printList();


        System.out.println("Merge Lists by recursion");
        Node mergedHeadUsingRecursion=mergeSortedLinkedListsUsingRecursion(list1.head,list2.head);
        list4.addToLast(mergedHeadUsingRecursion);
        list4.printList();


    }
}
