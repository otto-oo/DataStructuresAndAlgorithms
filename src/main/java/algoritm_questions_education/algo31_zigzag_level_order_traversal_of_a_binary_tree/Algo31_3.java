package main.java.algoritm_questions_education.algo31_zigzag_level_order_traversal_of_a_binary_tree;

import java.util.Stack;

public class Algo31_3 {

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
        zigzagLevelOrderTraversalOfABinaryTree(myTree);
        //System.out.println("height(myTree) = " + height(myTree, myTree.leftNode));
    }

    public static void zigzagLevelOrderTraversalOfABinaryTree(TreeNode root) {
        if (root == null) {
            System.out.println("Tree is null");
        }
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty() || !stack2.empty()) {
            while (!stack.isEmpty()) {
                TreeNode tempNode;
                tempNode = stack.pop();
                System.out.println("Node.value = " + tempNode.value);
                if (tempNode.leftNode != null) {
                    stack2.push(tempNode.leftNode);
                }
                if (tempNode.rightNode != null) {
                    stack2.push(tempNode.rightNode);
                }
            }
            while (!stack2.isEmpty()) {
                TreeNode tempNode;
                tempNode = stack2.pop();
                System.out.println("Node.value = " + tempNode.value);
                if (tempNode.rightNode != null) {
                    stack.add(tempNode.rightNode);
                }
                if (tempNode.leftNode != null) {
                    stack.add(tempNode.leftNode);
                }
            }
        }
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