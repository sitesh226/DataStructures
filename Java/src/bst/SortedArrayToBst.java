package bst;

public class SortedArrayToBst {

    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data=data;
        }
    }

    public void preOrderTraversal(TreeNode root){
        System.out.print(root.data+ " ");
        if(root.left!=null){
            preOrderTraversal(root.left);
        }
        if(root.right!=null){
            preOrderTraversal(root.right);
        }
    }


    public TreeNode getBstFromSortedArray(int[] arr,int start,int end){

        if(start<=end) {
            int mid = (start + end) / 2;
            TreeNode node = new TreeNode(arr[mid]);

            node.left = getBstFromSortedArray(arr, start, mid - 1);
            node.right = getBstFromSortedArray(arr, mid + 1, end);
            return node;
        }
        else
            return null;
    }


    public static void main(String[] args){
        int[] arr={10,30,40,50,60,70};
        SortedArrayToBst arrayToBst=new SortedArrayToBst();
        TreeNode head=arrayToBst.getBstFromSortedArray(arr,0,arr.length-1);
        arrayToBst.preOrderTraversal(head);

    }
}
