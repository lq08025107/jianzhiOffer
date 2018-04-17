package C4;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TopBottom {
    public static void printFromTopToBottom(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null){
            queue.offer(root);
            while(queue.size() != 0){
                TreeNode node = queue.poll();
                System.out.print(node.val + " ");

                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
        }
    }
}
