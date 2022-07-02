package main.java.algoritm_questions_education.algo35_find_route_of_binary_tree;

public class Algo35 {
    public static void main(String[] args) {
        Tree.TreeNode myTree = new Tree.TreeNode(10);
        myTree.leftNode = new Tree.TreeNode(4);
        myTree.rightNode = new Tree.TreeNode(16);
        myTree.leftNode.leftNode = new Tree.TreeNode(2);
        myTree.leftNode.rightNode = new Tree.TreeNode(8);
        myTree.rightNode.leftNode = new Tree.TreeNode(12);
        myTree.rightNode.rightNode = new Tree.TreeNode(20);
        myTree.leftNode.rightNode.leftNode = new Tree.TreeNode(6);
        myTree.leftNode.rightNode.rightNode = new Tree.TreeNode(9);
        Tree.printTree(myTree, null, false);
        findRouteOfBinaryTree(myTree,9);
    }

    public static void findRouteOfBinaryTree(Tree.TreeNode root, int p){
        int rootValue = root.value;
        System.out.print(rootValue + ", ");
        if (rootValue > p){
            findRouteOfBinaryTree(root.leftNode, p);
        } else if (rootValue < p){
            findRouteOfBinaryTree(root.rightNode, p);
        }
    }
}
