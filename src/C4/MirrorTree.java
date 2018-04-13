package C4;

import utils.TreeNode;

public class MirrorTree {
    /**
     * 寻找树的镜像
     * @param node
     * @return
     */
    public static TreeNode getMirrorTree(TreeNode node){
        if(node == null)
            return null;
        if(node.left == null && node.right == null)
            return node;
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;

        getMirrorTree(node.left);
        getMirrorTree(node.right);
        return node;
    }
}
