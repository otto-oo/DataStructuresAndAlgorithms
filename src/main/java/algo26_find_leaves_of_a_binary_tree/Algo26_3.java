package main.java.algo26_find_leaves_of_a_binary_tree;

import java.util.ArrayList;
import java.util.List;

public class Algo26_3 {

    public static void main(String[] args) {

        TreeNode myTree = new TreeNode(1);
        myTree.leftNode = new TreeNode(2);
        myTree.rightNode = new TreeNode(3);
        myTree.leftNode.leftNode = new TreeNode(4);
        myTree.leftNode.rightNode = new TreeNode(5);
        //myTree.rightNode.leftNode = new TreeNode(6);
        //myTree.rightNode.rightNode = new TreeNode(7);
        //myTree.leftNode.leftNode.leftNode = new TreeNode(8);

        System.out.println("findLeaves(myTree) = " + findLeaves(myTree));
    }

    public static List<List<Integer>> findLeaves(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> left = findLeaves(root.leftNode);       //  finding left node
        List<List<Integer>> right = findLeaves(root.rightNode);     // finding right node

        List<Integer> tempList = new ArrayList<>();
        tempList.add(root.value);                                       // adding value to the temp list

        for(int i=0; i< right.size(); i++){
            left.get(i).addAll(right.get(i));                       // merging right list to the left list
        }
        List<List<Integer>> resultList = left;                      // assigning left list to the result list
        resultList.add(tempList);                                       // adding list to the result list
        return resultList;
    }

    public static class TreeNode {
         int value;
         TreeNode leftNode;
         TreeNode rightNode;

         TreeNode(int val)
         {
             this.value = val;
         }
    }
}
