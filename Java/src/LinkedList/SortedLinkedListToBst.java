package LinkedList;

public class SortedLinkedListToBst {

    private static Node head;

    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public void addToLast(Node newNode){
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public void printLinkedList(){
        System.out.print("Lined list: ");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println();

    }

    public Node findMiddleElementOfLinkedList(Node head){
        Node fastPointer=head;
        Node slowPointer=head;
        while (fastPointer!=null&&fastPointer.next!=null){
            fastPointer=fastPointer.next.next;
            slowPointer=slowPointer.next;
        }
        return slowPointer;
    }

//    public TreeNode getBalancedBstFromSortedLinkedList(){
//        TreeNode root=new TreeNode(findMiddleElementOfLinkedList(head).data);
//
//    }

    private static class TreeNode{
        TreeNode left;
        TreeNode right;;
        int data;
        TreeNode(int data){
            this.data=data;
        }
    }
}
