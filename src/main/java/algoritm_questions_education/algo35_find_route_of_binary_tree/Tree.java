package main.java.algoritm_questions_education.algo35_find_route_of_binary_tree;

public class Tree {

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

    public static void printTree(TreeNode root, Trunk prev, boolean isLeft){
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
