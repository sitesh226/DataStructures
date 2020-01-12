package binaryTree;

import sun.reflect.generics.tree.Tree;

public class GetNodeLevelInBinaryTree {

    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
        }
    }

    public static TreeNode createBinaryTree(){
        TreeNode root=new TreeNode(40);

        root.left=new TreeNode(20);
        root.right=new TreeNode(60);

        root.left.left=new TreeNode(10);
        root.left.right=new TreeNode(30);

        root.right.left=new TreeNode(50);
        root.right.right=new TreeNode(70);

        return root;

    }

    public static int getLevelOfNode(TreeNode root,TreeNode node,int level){
        if(root==null)
            return 0;

        if(root.data==node.data)
            return level;

        int result=getLevelOfNode(root.left,node,level+1);
        if(result!=0){
            return result;
        }

        result=getLevelOfNode(root.right,node,level+1);
        return result;

    }

    public static void main(String[] args){
        TreeNode root=createBinaryTree();
        System.out.println("Node data: 70,Level :"+getLevelOfNode(root,new TreeNode(70) , 1));
        System.out.println("Node data: 100,Level :"+getLevelOfNode(root, new TreeNode(100), 1));
        System.out.println("Node data: 60,Level :"+getLevelOfNode(root, new TreeNode(60), 1));
        System.out.println("Node data: 40,Level :"+getLevelOfNode(root, new TreeNode(40), 1));
    }
}
