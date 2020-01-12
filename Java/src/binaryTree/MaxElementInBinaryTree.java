package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxElementInBinaryTree {

    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
        }
    }
    public static TreeNode createTree(){
        TreeNode node=new TreeNode(20);
        node.left=new TreeNode(12);
        node.right=new TreeNode(22);
        node.left.left=new TreeNode(10);
        node.left.right=new TreeNode(14);
        node.right.left=new TreeNode(21);
        node.right.right=new TreeNode(24);
        return  node;
    }

    public static int getMaxElementInBinaryTreeUsingRecursion(TreeNode root){
        int max=Integer.MIN_VALUE;
        int value=0;
        int left,right;
        if(root!=null){
            value=root.data;
            left=getMaxElementInBinaryTreeUsingRecursion(root.left);
            if(left>max)
                max=left;

            right=getMaxElementInBinaryTreeUsingRecursion(root.right);
            if(right>max)
                max=right;

            if (value>max)
                max=value;
        }

        return max;
    }


    public static int getMaxElementInBinaryTreeUsingIteration(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int max=Integer.MIN_VALUE;
        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp.data > max)
                max = temp.data;
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
        return max;
    }

    public static void main(String[] args){
        TreeNode root=createTree();
        System.out.println("Get Max element using recursion:"+ getMaxElementInBinaryTreeUsingRecursion(root));
        System.out.println("Get Max element using iteration:"+ getMaxElementInBinaryTreeUsingIteration(root));
    }
}
