package main.java.algo27_fsum_of_node_depths;

import java.util.LinkedList;
import java.util.Queue;

public class Algo27 {

    public static void main(String[] args) {

        //TreeNode myTree = new TreeNode();
        TreeNode myTree = new TreeNode(1);
        myTree.leftNode = new TreeNode(2);
        myTree.rightNode = new TreeNode(3);
        myTree.leftNode.leftNode = new TreeNode(4);
        myTree.leftNode.rightNode = new TreeNode(5);
        myTree.rightNode.leftNode = new TreeNode(6);
        myTree.rightNode.rightNode = new TreeNode(7);
        myTree.leftNode.leftNode.leftNode = new TreeNode(8);
        myTree.leftNode.leftNode.rightNode = new TreeNode(9);

        System.out.println("fSumOfNodeDepths(myTree) = " + fSumOfNodeDepths(myTree));

    }

    public static int fSumOfNodeDepths(TreeNode root){

        int height = 0;
        int totalHeight = 0;
        if(root==null){
            return -1;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        System.out.println("The depth of the node with value " + root.value + " is " + height);

        while(!queue.isEmpty()){
            TreeNode tempNode = queue.remove();

            if(tempNode.leftNode != null & tempNode.rightNode != null){
                height++;
                totalHeight = totalHeight + 2 * height;
                System.out.println("The depth of the node with value " + tempNode.leftNode.value + " is " + height);
                System.out.println("The depth of the node with value " + tempNode.rightNode.value + " is " + height);
                queue.add(tempNode.leftNode);
                queue.add(tempNode.rightNode);

            }
        }
        return totalHeight;
    }



    /*public static int fSumOfNodeDepths(TreeNode root){

        int height = 0;
        int totalHeight = 0;
        if(root==null){
            return -1;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode tempNode = queue.remove();
            System.out.println("The depth of the node with value " + tempNode.value + " is " + height);

            if(tempNode.leftNode != null){
                queue.add(tempNode.leftNode);
                height++;
            }
            if(tempNode.rightNode != null){
                queue.add(tempNode.rightNode);
                //totalHeight++;
            }
            //height++;
        }
        return totalHeight;
    }*/

    public static class TreeNode {
        int value;
        TreeNode leftNode;
        TreeNode rightNode;

        TreeNode(){

        }
        TreeNode(int val)
        {
            this.value = val;
        }
    }
}
