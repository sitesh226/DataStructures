package LinkedList;

public class AddTwoNumbersLinkedList {

    private static Node head;

    private static class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }

    public void addToLast(Node node){
        if(head==null){
            head=node;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }

    public void printList(Node head){
        System.out.print("Linked list :");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"  ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node reverseLinkedList(Node head){
        Node previousNode=null;
        Node nextnode;
        Node currentNode=head;
        while(currentNode!=null){
            nextnode=currentNode.next;
            currentNode.next=previousNode;
            previousNode=currentNode;
            currentNode=nextnode;

        }

        return previousNode;
    }

    public Node sumOfLinkedList(Node l1,Node l2){
        int sum=0;
        int carry=0;
        Node newHead=null;
        Node tempNodeForIteration=null;
        int firstIteration=0;


        while(l1!=null||l2!=null){
            firstIteration++;
            sum=carry;

            if(l1!=null) {
                sum += l1.value;
                l1=l1.next;
            }

            if(l2!=null) {
                sum += l2.value;
                l2=l2.next;
            }

            carry=sum/10;
            sum=sum%10;

            //Check if its first node for resulting ll
            if(firstIteration==1){
                tempNodeForIteration=new Node(sum);
                newHead=tempNodeForIteration;
            }else {
                Node tempSumNode=new Node(sum);
                tempNodeForIteration.next=tempSumNode;
                tempNodeForIteration=tempNodeForIteration.next;

            }
        }

        if(carry!=0){
            Node lastNode=new Node(carry);
            tempNodeForIteration.next=lastNode;
        }
        return newHead;
    }

    public static void main(String[] args){
        AddTwoNumbersLinkedList list = new AddTwoNumbersLinkedList();
        // Creating a linked list
        Node head1=new Node(5);
        list.addToLast(head1);
        list.addToLast(new Node(6));
        list.addToLast(new Node(7));
        list.addToLast(new Node(1));
        list.addToLast(new Node(2));
        System.out.print("Number 1:  ");
        list.printList(head1);

        head=null;
        Node head2=new Node(6);
        list.addToLast(head2);
        list.addToLast(new Node(3));
        list.addToLast(new Node(5));
        list.addToLast(new Node(9));

        System.out.print("Number 2:  ");
        list.printList(head2);

        // Reversing first linkedList
        head1=reverseLinkedList(head1);

        //Reversing second linkedList
        head2=reverseLinkedList(head2);

        // function to find sum of two linkedlist represent by number
        Node result= list.sumOfLinkedList(head1,head2);
        // Reverse the above linkedlist to get actual sum
        result=reverseLinkedList(result);
        System.out.print("Sum:  ");
        list.printList(result);
    }

}
