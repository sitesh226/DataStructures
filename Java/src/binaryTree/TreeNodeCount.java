package binaryTree;

public class TreeNodeCount {

    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
        }
    }

    public TreeNode createTree(){
        TreeNode node=new TreeNode(20);
        node.left=new TreeNode(12);
        node.right=new TreeNode(22);
        node.left.left=new TreeNode(10);
        node.left.right=new TreeNode(14);
        node.right.left=new TreeNode(21);
        node.right.right=new TreeNode(24);
        return  node;
    }

    public int getLeafNodeCount(TreeNode node){
        if(node==null)
            return 0;
        if(node.left==null && node.right==null)
            return 1;
        else
            return getLeafNodeCount(node.left)+getLeafNodeCount(node.right);
    }

    public void printLeafNodes(TreeNode node){
        if(node.left==null && node.right==null)
            System.out.print(" "+ node.data);
        else {
            printLeafNodes(node.left);
            printLeafNodes(node.right);
        }
    }

    public void printAllPathsToLeaf(TreeNode node,int[] path,int length){
        if(node==null)
            return;

        path[length]=node.data;
        length++;

        if(node.left==null && node.right==null){
            printArray(path,length);
            System.out.println();
            return;
        }
        printAllPathsToLeaf(node.left,path,length);
        printAllPathsToLeaf(node.right,path,length);
    }

    public void printArray(int[] arr,int length){
        for(int i=0;i<length;i++){
            System.out.print(" "+arr[i]);
        }

    }


    public static void main(String[] args){
        TreeNodeCount nodeCount=new TreeNodeCount();
        TreeNode root=nodeCount.createTree();
        System.out.println("The number of leaf nodes are :"+ nodeCount.getLeafNodeCount(root));
        System.out.print("The leaf nodes are :");
        nodeCount.printLeafNodes(root);
        System.out.println();
        System.out.println("All paths to leaf node:");
        nodeCount.printAllPathsToLeaf(root,new int[1000],0);
    }
}
