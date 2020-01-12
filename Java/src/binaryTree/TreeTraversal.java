package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    public void spiralOrderTraversal(TreeNode root,boolean clockWise){
        Stack<TreeNode> evenStack=new Stack<>();
        Stack<TreeNode> oddStack=new Stack<>();

        boolean evenLevel;

        if(clockWise) {
            oddStack.push(root);
            evenLevel = false;
        }
        else{
             evenStack.push(root);
             evenLevel=true;
        }

        while((evenLevel&&!evenStack.isEmpty())||!oddStack.isEmpty()){

            if(evenLevel){

                while(!evenStack.isEmpty()){
                    TreeNode tempNode=evenStack.pop();
                    System.out.print(tempNode.data+ "  ");

                    if(tempNode.right!=null)
                        oddStack.push(tempNode.right);
                    if(tempNode.left!=null)
                        oddStack.push(tempNode.left);
                }
            }else {

                while(!oddStack.isEmpty()){
                    TreeNode tempNode=oddStack.pop();
                    System.out.print(tempNode.data+ "  ");

                    if(tempNode.left!=null)
                        evenStack.push(tempNode.left);
                    if(tempNode.right!=null)
                        evenStack.push(tempNode.right);

                }
            }

            //toggle level variable
            evenLevel=!evenLevel;
        }
    }

    public void boundaryTraversal(TreeNode root){
        System.out.print(root.data+ " ");
        printLeftEdgeNodes(root.left);
        printLeafNodes(root);
        printRightNodesBottomToUp(root.right);

    }

    public void printLeftEdgeNodes(TreeNode node){
        if(node==null)
            return;

        //ignore if leaf node
        if(node.left==null&& node.right==null)
        {
            return;
        }

        System.out.print(node.data+ " ");

        if(node.left!=null)
            printLeftEdgeNodes(node.left);
        if(node.right!=null)
            printLeftEdgeNodes(node.right);
    }

    public void printLeafNodes(TreeNode node){
        if(node==null)
            return;

        if(node.left==null&& node.right==null){
            System.out.print(node.data+" ");
            return;
        }
        if(node.left!=null)
            printLeafNodes(node.left);
        if(node.right!=null)
            printLeafNodes(node.right);
    }

    public void printRightNodesBottomToUp(TreeNode node){
        if(node==null)
        return;

        //ignore if leaf node
        if(node.left==null&& node.right==null)
        {
            return;
        }

        if(node.right!=null)
            printRightNodesBottomToUp(node.right);
        if(node.left!=null)
            printRightNodesBottomToUp(node.left);

        System.out.println(node.data+ " ");
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

        System.out.print("Spiral order traversal in clockwise:  ");
        treeTraversal.spiralOrderTraversal(root,true);
        System.out.println();

        System.out.print("Spiral order traversal anticlockwise:  ");
        treeTraversal.spiralOrderTraversal(root,false);
        System.out.println();

        System.out.print("Boundary  traversal :  ");
        treeTraversal.boundaryTraversal(root);
        System.out.println();
    }

}
