package C4;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class PathSum {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> path = new LinkedList<>();
        dfs(root, sum, res, path);
        return res;
    }
    public void dfs(TreeNode root, int sum, List<List<Integer>> res, List<Integer> path){
        if(root == null)
            return;
        path.add(root.val);
        if(root.left == null && root.right == null && root.val == sum)
            res.add(new LinkedList(path));
        if(root.left != null){
            dfs(root.left, sum - root.val, res, path);
            path.remove(path.size() - 1);
        }
        if(root.right != null){
            dfs(root.right, sum - root.val, res, path);
            path.remove(path.size() - 1);
        }
    }
}
