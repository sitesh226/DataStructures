package binaryTree;

import java.util.Map;
import java.util.TreeMap;

public class VerticalSumOfBinaryTree {

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

    public static void getVerticalSum(TreeNode node,TreeMap<Integer,Integer> treeMap,int level){
        if(node==null)
            return;

        getVerticalSum(node.left,treeMap,level-1);

        if(treeMap.get(level)!=null){
            Integer sum=treeMap.get(level)+node.data;
            treeMap.put(level,sum);
        }else{
            treeMap.put(level,node.data);
        }

        getVerticalSum(node.right,treeMap,level+1);
    }

    public static void main(String[] args){
        TreeNode root=createBinaryTree();
        System.out.println("Vertical Sum: ");
        TreeMap<Integer,Integer> treeMap=new TreeMap<>();
        getVerticalSum(root,treeMap,0);

        for(Map.Entry<Integer,Integer> entry:treeMap.entrySet()){
            System.out.println("Level :"+entry.getKey()+ "   Sum:"+entry.getValue());
        }
    }

}
