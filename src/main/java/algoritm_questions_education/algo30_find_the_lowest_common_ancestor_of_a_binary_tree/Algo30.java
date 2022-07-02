package main.java.algoritm_questions_education.algo30_find_the_lowest_common_ancestor_of_a_binary_tree;

public class Algo30 {

    public static void main(String[] args) {
        Tree.TreeNode myTree = new Tree.TreeNode(3);
        myTree.leftNode = new Tree.TreeNode(5);
        myTree.rightNode = new Tree.TreeNode(1);
        myTree.leftNode.leftNode = new Tree.TreeNode(6);
        myTree.leftNode.rightNode = new Tree.TreeNode(2);
        myTree.rightNode.leftNode = new Tree.TreeNode(0);
        myTree.rightNode.rightNode = new Tree.TreeNode(8);
        myTree.leftNode.rightNode.leftNode = new Tree.TreeNode(7);
        myTree.leftNode.rightNode.rightNode = new Tree.TreeNode(4);
        Tree.printTree(myTree, null, false);
        System.out.println("lowestCommonAncestorOfABinaryTree(myTree, 5, 8) = " + lowestCommonAncestorOfABinaryTree(myTree, myTree.leftNode, myTree.rightNode.rightNode).value);
    }

    public static Tree.TreeNode lowestCommonAncestorOfABinaryTree(Tree.TreeNode root, Tree.TreeNode p, Tree.TreeNode q){
        if(root==null){
            return null;
        }
        if(root==p || root==q){ // if root is equal to p or q return root
            return root;
        }
        Tree.TreeNode left = lowestCommonAncestorOfABinaryTree(root.leftNode, p, q);
        Tree.TreeNode right = lowestCommonAncestorOfABinaryTree(root.rightNode, p, q);

        if(left==null){        // if left is null means p or q does not match with left
            return right;
        }else if(right==null){ // if right is null means p or q does not match with right
            return left;
        }
        return root;  // if both of them has a node then we found ancestor of them
    }
}