package main.java.algoritm_questions_education.algo31_zigzag_level_order_traversal_of_a_binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Algo31_4 {

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

        printTree(myTree, null, false);
        System.out.println("zigzagLevelOrderTraversalOfABinaryTree(myTree) = " + zigzagLevelOrderTraversalOfABinaryTree(myTree));
        //System.out.println("height(myTree) = " + height(myTree, myTree.leftNode));
    }

    public static List<List<Integer>> zigzagLevelOrderTraversalOfABinaryTree(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        List<List<Integer>> resultList = new ArrayList<>();
        stack.push(root);
        while (!stack.isEmpty() || !stack2.empty()) {           // do until stacks are empty
            List<Integer> tempList = new ArrayList<>();
            List<Integer> tempList2 = new ArrayList<>();
            while (!stack.isEmpty()) {
                TreeNode tempNode;
                tempNode = stack.pop();
                tempList.add(tempNode.value);
                if (tempNode.leftNode != null) {
                    stack2.push(tempNode.leftNode);             // push to the 2nd stack
                }
                if (tempNode.rightNode != null) {
                    stack2.push(tempNode.rightNode);
                }
            }
            resultList.add(tempList);
            while (!stack2.isEmpty()) {
                TreeNode tempNode;
                tempNode = stack2.pop();
                tempList2.add(tempNode.value);
                if (tempNode.rightNode != null) {
                    stack.add(tempNode.rightNode);              // push to the 1st stack
                }
                if (tempNode.leftNode != null) {
                    stack.add(tempNode.leftNode);
                }
            }
                resultList.add(tempList2);
        }
        return resultList;
    }

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

    public static void showTrunks(Trunk p){
        if (p == null) {
            return;
        }

        showTrunks(p.prev);
        System.out.print(p.str);
    }

    public  static void printTree(TreeNode root, Trunk prev, boolean isLeft){
        if (root == null) {
            return;
        }

        String prev_str = "    ";
        Trunk trunk = new Trunk(prev, prev_str);

        printTree(root.rightNode, trunk, true);

        if (prev == null) {
            trunk.str = "———";
        }
        else if (isLeft) {
            trunk.str = ".———";
            prev_str = "   |";
        }
        else {
            trunk.str = "`———";
            prev.str = prev_str;
        }

        showTrunks(trunk);
        System.out.println(" " + root.value);

        if (prev != null) {
            prev.str = prev_str;
        }
        trunk.str = "   |";

        printTree(root.leftNode, trunk, false);
    }

    public static class Trunk{
        Trunk prev;
        String str;
        Trunk(Trunk prev, String str)
        {
            this.prev = prev;
            this.str = str;
        }
    }

    public static int height(TreeNode root, TreeNode node) {
        int height = 0;
        if (root == null)
            return -1;

        if(root==node){
            return height;
        }

        return 1 + Math.max(
                height(root.leftNode, node),
                height(root.rightNode, node));
    }
}