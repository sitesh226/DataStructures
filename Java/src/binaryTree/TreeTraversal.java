package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {

    public class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int inputData){
            this.data=inputData;
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

    public void levelOrderTraversal(TreeNode root){
        System.out.print("Level order traversal:  ");
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");

            if(temp.left!=null)
                queue.add(temp.left);
            if (temp.right!=null)
                 queue.add(temp.right);
        }

        System.out.println();

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


    public void inOrderTraversal(TreeNode root){
        if(root.left!=null){
            inOrderTraversal(root.left);
        }
        System.out.print(root.data+ " ");
        if(root.right!=null){
            inOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(TreeNode root){

        if(root.left!=null){
            postOrderTraversal(root.left);
        }
        if(root.right!=null){
            postOrderTraversal(root.right);
        }
        System.out.print(root.data+ " ");
    }

    public void reverseLevelOrderTraversal(){


    }

    public static void main(String[] args){
        TreeTraversal treeTraversal=new TreeTraversal();
        TreeNode root=treeTraversal.createTree();
        treeTraversal.levelOrderTraversal(root);

        System.out.print("Pre Order traversal:  ");
        treeTraversal.preOrderTraversal(root);
        System.out.println();

        System.out.print("Post Order traversal:  ");
        treeTraversal.postOrderTraversal(root);
        System.out.println();

        System.out.print("In Order traversal:  ");
        treeTraversal.inOrderTraversal(root);
        System.out.println();
    }

}
