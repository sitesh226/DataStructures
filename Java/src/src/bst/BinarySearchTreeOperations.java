package bst;




public class BinarySearchTreeOperations {

    public class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
        }

    }

    public  boolean searchBST(TreeNode root,TreeNode nodeToBeSearched){
        if(root==null)
            return false;

        if(root.data==nodeToBeSearched.data){
            return true;
        }
        boolean result=false;
        if(root.data>nodeToBeSearched.data){
            result=searchBST(root.left,nodeToBeSearched);
        }else
            result =searchBST(root.right,nodeToBeSearched);

        return result;
    }

    public  TreeNode insertNodeInBST(TreeNode root,TreeNode nodeToBeInserted) {
        if (root == null) {
            root = nodeToBeInserted;
            return root;
        }

        if (root.data > nodeToBeInserted.data) {
            if (root.left == null) {
                root.left = nodeToBeInserted;
            } else {
                insertNodeInBST(root.left, nodeToBeInserted);
            }
        } else {
            if (root.right == null) {
                root.right = nodeToBeInserted;
            } else {
                insertNodeInBST(root.right, nodeToBeInserted);
            }
        }
        return root;
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


    public void inOrderTraversal(TreeNode root){
        if(root.left!=null){
            inOrderTraversal(root.left);
        }
        System.out.print(root.data+ " ");
        if(root.right!=null){
            inOrderTraversal(root.right);
        }
    }

    // Get minimum element in binary search tree
    public  TreeNode minimumElement(TreeNode root) {
        if (root.left == null)
            return root;
        else {
            return minimumElement(root.left);
        }
    }

    // Get maximum element in binary search tree
    public  TreeNode maximumElement(TreeNode root) {
        if (root.right == null)
            return root;
        else {
            return maximumElement(root.right);
        }
    }

    public TreeNode deleteNodeInBST(TreeNode root,int value){
        if(root==null)
            return null;
        if(root.data>value)
            deleteNodeInBST(root.left,value);
        else if(root.data<value) {
             deleteNodeInBST(root.right, value);
         }else{
            //If node has both child
            if(root.left!=null&&root.right!=null){
                TreeNode temp=root;
                //Min element from right
                TreeNode minElementFromRight=minimumElement(temp.right);
                //Replace root with min element from right
                root.data=minElementFromRight.data;
                //Delete min element from right
                deleteNodeInBST(root.right,minElementFromRight.data);
            }
            else if(root.left!=null){
                root=root.left;
            }else if(root.right!=null){
                root=root.right;
            }
            else
                root=null;
        }
        return root;
    }

    public TreeNode getLCAOfTwoNodes(TreeNode root,TreeNode nodeA, TreeNode nodeB){
        if(root==null)
            return null;
        if(root.data>nodeA.data && root.data>nodeB.data)
            return getLCAOfTwoNodes(root.left,nodeA,nodeB);
        else if(root.data<nodeA.data && root.data<nodeB.data)
            return getLCAOfTwoNodes(root.right,nodeA,nodeB);

            return root;

    }

    public static void main(String[] args){
        BinarySearchTreeOperations bst=new BinarySearchTreeOperations();
        TreeNode root=bst.createTree();
        System.out.println("Tree Initially:");
        bst.inOrderTraversal(root);

        TreeNode node=bst.new TreeNode(29);
        System.out.println("\nInsert  new node: "+node.data);
        bst.insertNodeInBST(root,node);
        System.out.println("Tree after inserting: "+node.data);
        bst.inOrderTraversal(root);

        TreeNode node1=bst.new TreeNode(15);
        System.out.println("\nInsert  new node: "+node1.data);
        bst.insertNodeInBST(root,node1);
        System.out.println("Tree after inserting :"+node1.data);
        bst.inOrderTraversal(root);

        TreeNode node2=bst.new TreeNode(52);
        System.out.println("");
        System.out.println("Search node in bst "+node2.data);
        System.out.print(bst.searchBST(root,node2));

        bst.deleteNodeInBST(root,22);
        System.out.println("\ndelete node in bst: "+"22");
        System.out.println("Tree after deletion");
        bst.inOrderTraversal(root);

        TreeNode max= bst.maximumElement(root);
        System.out.println("\nMaximum Element in tree: "+max.data);

        TreeNode min=bst.minimumElement(root);
        System.out.print("\nMinimum Element in tree: "+min.data);

        TreeNode nodeA=bst.new TreeNode(22);
        TreeNode nodeB=bst.new TreeNode(29);
        TreeNode lca=bst.getLCAOfTwoNodes(root,nodeA,nodeB);
        System.out.println("\nLCA of "+nodeA.data+ " and "+nodeB.data +": "+lca.data);



    }
}
