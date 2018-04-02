package C2;

import utils.TreeNode;

public class ConstructTree {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length != inorder.length)
            return null;
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    public TreeNode build(int[] preorder, int preLow, int preHigh, int[] inorder, int inLow, int inHigh){
        if(preLow > preHigh || inLow > inHigh)
            return null;
        TreeNode root = new TreeNode(preorder[preLow]);

        int inRootIndex = inLow;
        for(int i = inLow; i <= inHigh; i++){
            if(inorder[i] == root.val){
                inRootIndex = i;
                break;
            }
        }
        int LeftTreeLen = inRootIndex - inLow;
        root.left = build(preorder,preLow + 1, preLow + LeftTreeLen, inorder, inLow, inRootIndex - 1);
        root.right = build(preorder, preLow + LeftTreeLen + 1, preHigh, inorder, inRootIndex + 1, inHigh);
        return root;
    }
}
