package main.java.algoritm_questions_education.algo28_invert_binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class Algo28 {

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

        System.out.println("*******Previous*******");
        printTree(myTree, null, false);
        invertBinaryTree(myTree);
        System.out.println("*******After*******");
        printTree(myTree, null, false);


        /*int depth = 0;
        System.out.println("Summing all of these depths yields " + sumOfNodeDepths(myTree, depth));

        beneathFirstTraversal(myTree);
        inorderTraversal(myTree);
        System.out.println();
        preorderTraversal(myTree);
        System.out.println();
        postorderTraversal(myTree);*/
    }

    public static TreeNode invertBinaryTree(TreeNode root){
        if(root==null){                                         // check if node is empty
            return null;
        }

        if(root.leftNode==null & root.rightNode==null) {        // check if node is leaf
            return root;
        }

        TreeNode tempNode = root.leftNode;                      // swapping nodes
        root.leftNode = root.rightNode;
        root.rightNode = tempNode;

        invertBinaryTree(root.leftNode);                        // recursive lefts
        invertBinaryTree(root.rightNode);                       // recursive rights

        return root;
    }

    public static int sumOfNodeDepths(TreeNode root, int depth){
        if (root==null){            // if the root or recursive node is null returning 0 to the recursive algorithm
            return 0;
        }

        System.out.println("The depth of the node with value " + root.value + " = " + depth);

        return  depth +                                                 // previous nodes' depth   [1 [2 [4 [8 [null][null]][9 [null][null]]][5 ]][3 [6 [null][null]][7 [null][null]]]]
                sumOfNodeDepths(root.leftNode, depth + 1) +      // node.left depth     [489] [245] [123] [367]
                sumOfNodeDepths(root.rightNode, depth + 1);      // node.right depth
    }

    public static TreeNode beneathFirstTraversal(TreeNode root){

        if(root==null){
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode tempNode = queue.remove();
            System.out.print(tempNode.value + " ");

            if(tempNode.leftNode != null){
                queue.add(tempNode.leftNode);
            }
            if(tempNode.rightNode != null){
                queue.add(tempNode.rightNode);
            }
        }
        return root;
    }

    public static TreeNode inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.leftNode);
            System.out.print(root.value + " ");
            inorderTraversal(root.rightNode);
        }
        return root;
    }

    public static TreeNode preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorderTraversal(root.leftNode);
            preorderTraversal(root.rightNode);
        }
        return root;
    }

    public static TreeNode postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.leftNode);
            postorderTraversal(root.rightNode);
            System.out.print(root.value + " ");
        }
        return root;
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
}
