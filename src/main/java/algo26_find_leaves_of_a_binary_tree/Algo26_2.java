package main.java.algo26_find_leaves_of_a_binary_tree;

import java.util.ArrayList;
import java.util.List;

public class Algo26_2 {

    public static void main(String[] args) {

        TreeNode myTree = new TreeNode(1);
        myTree.leftNode = new TreeNode(2);
        myTree.rightNode = new TreeNode(3);
        myTree.leftNode.leftNode = new TreeNode(4);
        myTree.leftNode.rightNode = new TreeNode(5);

        System.out.println("findLeaves(myTree).toString() = " + findLeaves(myTree).toString());
    }

    public static List<List<Integer>> findLeaves(TreeNode root) {
        if(root==null) {
            return new ArrayList<>();
        }
        List<List<Integer>> left = findLeaves(root.leftNode);
        List<List<Integer>> right = findLeaves(root.rightNode);

        List<Integer> list = new ArrayList<>();
        list.add(root.value);

        if(left.size() > right.size()){
            for(int i=0; i< right.size(); i++){
                left.get(i).addAll(right.get(i));
            }
            List<List<Integer>> lli = left;
            lli.add(list);
            return lli;
        }else{
            for(int i=0; i< left.size(); i++){
                right.get(i).addAll(left.get(i));
            }
            List<List<Integer>> lli = right;
            lli.add(list);
            return lli;
        }
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
