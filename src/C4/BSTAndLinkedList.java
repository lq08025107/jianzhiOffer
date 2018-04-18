package C4;

import utils.TreeNode;

public class BSTAndLinkedList {
    public static TreeNode conver(TreeNode root){
        TreeNode lastNodeInList = null;
        convertNode(root, lastNodeInList);

        TreeNode headOfList = lastNodeInList;
        while(headOfList != null && headOfList.left != null){
            headOfList = headOfList.left;
        }
        return headOfList;
    }

    public static void convertNode(TreeNode node, TreeNode lastNodeInList){
        if(node == null){
            return;
        }
        TreeNode current = node;
        if(current.left != null){
            convertNode(current.left, lastNodeInList);
        }
        current.left = lastNodeInList;
        if(lastNodeInList != null){
            lastNodeInList.right = current;
        }
        lastNodeInList = current;
        if (current.right != null)
            convertNode(current.right, lastNodeInList);
    }
}
