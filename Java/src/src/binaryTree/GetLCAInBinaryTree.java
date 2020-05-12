package binaryTree;

public class GetLCAInBinaryTree {

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

    public static TreeNode getLCA(TreeNode root,TreeNode nodeA,TreeNode nodeB){
        if(root==null)
            return null ;
        else {
            if (root.data == nodeA.data || root.data == nodeB.data)
                return root;
        }

            TreeNode left = getLCA(root.left, nodeA, nodeB);
            TreeNode right = getLCA(root.right, nodeA, nodeB);

            if (left != null && right != null)
                return root;
            else if (left == null && right == null)
                return null;
            else
                return left == null ? right : left;

    }

    public static void main(String[] args){
        TreeNode root=createBinaryTree();
        TreeNode lca=getLCA(root,new TreeNode(50),new TreeNode(20));
        System.out.println("LCA : "+lca.data);
    }
}
