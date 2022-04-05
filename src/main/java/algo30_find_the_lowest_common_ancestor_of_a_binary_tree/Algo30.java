package main.java.algo30_find_the_lowest_common_ancestor_of_a_binary_tree;

public class Algo30 {

    public static void main(String[] args) {
        //TreeNode myTree = new TreeNode();
        TreeNode myTree = new TreeNode(3);
        myTree.leftNode = new TreeNode(5);
        myTree.rightNode = new TreeNode(1);
        myTree.leftNode.leftNode = new TreeNode(6);
        myTree.leftNode.rightNode = new TreeNode(2);
        myTree.rightNode.leftNode = new TreeNode(0);
        myTree.rightNode.rightNode = new TreeNode(8);
        myTree.leftNode.rightNode.leftNode = new TreeNode(7);
        myTree.leftNode.rightNode.rightNode = new TreeNode(4);
        printTree(myTree, null, false);
        System.out.println("lowestCommonAncestorOfABinaryTree(myTree, p, q) = " + lowestCommonAncestorOfABinaryTree(myTree, myTree.leftNode, myTree.rightNode.rightNode).value);


    }

    public static TreeNode lowestCommonAncestorOfABinaryTree(TreeNode root, TreeNode p, TreeNode q){
        if(root==null){
            return null;
        }
        if(root==p || root==q){ // if root is equal to p or q return root
            return root;
        }
        TreeNode left = lowestCommonAncestorOfABinaryTree(root.leftNode, p, q);
        TreeNode right = lowestCommonAncestorOfABinaryTree(root.rightNode, p, q);

        if(left==null){        // if left is null means p or q does not match with left
            return right;
        }else if(right==null){ // if right is null means p or q does not match with right
            return left;
        }
        return root;  // if both of them has a node then we found ancestor of them
    }

    public static void showTrunks(Trunk p){
        if (p == null) {
            return;
        }

        showTrunks(p.prev);
        System.out.print(p.str);
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
