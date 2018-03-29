package C6;

import utils.TreeNode;

public class DepthOfBinaryTree {
    public static int depth(TreeNode root){
        if(root == null) return 0;
        TreeNode left = root.left;
        TreeNode right = root.right;
        int depthLeft = depth(left);
        int depthright = depth(right);
        return (depthLeft >= depthright) ? depthLeft + 1: depthright + 1;
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

        int result = depth(node1);
        System.out.println(result);
    }
}
