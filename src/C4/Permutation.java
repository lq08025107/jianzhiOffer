package C4;

import utils.Display;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    //排列
    //https://blog.csdn.net/jiao_yu/article/details/52493600
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        dfs(res, nums, 0);
        return res;
    }
    private void dfs(List<List<Integer>> res, int[] nums, int start) {
        if (start == nums.length) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int num : nums) temp.add(num);
            res.add(temp);
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums, i, start);
            dfs(res, nums, start+1);
            swap(nums, i, start);
        }
    }
    private void swap(int[] nums, int m, int n) {
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }
    public static void main(String[] args){
        List<List<Integer>> list = new Permutation().permute(new int[]{1,2,3});
        Display.showList(list);
    }
}
