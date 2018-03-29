package C3;

import utils.TreeNode;

public class HasSubTree {
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null) return false;
        if(isSame(s, t)) return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    public static  boolean isSame(TreeNode s, TreeNode t){
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;

        if(s.val != t.val) return false;

        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }
    public static void main(String[] args){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node4.left = null;
        node4.right = null;
        node5.left = null;
        node5.right = null;
        node6.left = null;
        node6.right = null;
        node7.left = null;
        node7.right = null;

        TreeNode node2_1 = new TreeNode(2);
        TreeNode node4_1 = new TreeNode(4);
        TreeNode node5_1 = new TreeNode(5);

        node2_1.left = node4_1;
        node2_1.right = node5_1;
        node4_1.left = null;
        node4_1.right = null;
        node5_1.left = null;
        node5_1.right = null;

        System.out.println(isSubtree(node1, node2_1));

    }
}
