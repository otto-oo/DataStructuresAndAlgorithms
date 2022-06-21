package main.java.algoritm_questions_education.algo26_find_leaves_of_a_binary_tree;

import java.util.ArrayList;
import java.util.List;

public class Algo26 {

    //private static TreeNode root;

    public static void main(String[] args) {

        TreeNode myTree = new TreeNode(1);
        //myTree.leftNode = new TreeNode(2);
        //myTree.rightNode = new TreeNode(3);
        //myTree.leftNode.leftNode = new TreeNode(4);
        //myTree.leftNode.rightNode = new TreeNode(5);

        System.out.println("findLeaves(myTree).toString() = " + findLeaves(myTree).toString());
    }

    public static List<List<Integer>> findLeaves(TreeNode root) {
        if(root==null) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> left = findLeaves(root.leftNode);
        List<List<Integer>> right = findLeaves(root.rightNode);

        List<Integer> list = new ArrayList<>();
        list.add(root.value);

        if(left == null && right == null){
            List<List<Integer>> result = new ArrayList<>();
            result.add(list);
            return result;
        }else if(left == null || right == null){
            List<List<Integer>> result = left == null ? right : left;
            result.add(list);
            return result;
        }else{
            List<List<Integer>> lli = left.size() > right.size() ? merge(left,right): merge(right,left);
            lli.add(list);
            return lli;
        }
    }

    private static List<List<Integer>> merge(List<List<Integer>> large, List<List<Integer>> small){
        for(int i=0; i< small.size(); i++){
            large.get(i).addAll(small.get(i));
        }
        return large;
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

    /*public static void insertBinaryTree(int value){
        TreeNode node = new TreeNode(value);
        if(root==null){
            root = node;
            return;
        }
        TreeNode currentNode = root;
        while(currentNode!=null){
            currentNode = currentNode.leftNode;
        }
    }*/
}
