package C2;

public class FindMinInSortArray {
    //时间复杂度O(n)
     public int findMin1(int[] nums) {
         int min = Integer.MAX_VALUE;
         for(int i = 0; i < nums.length; i++){
             if(min >= nums[i])
                 min = nums[i];
         }
         return min;
     }
    //时间复杂度O（logn）
    public int findMin(int[] nums){
        if(nums.length == 1) return nums[0];
        int p1 = 0;
        int p2 = nums.length - 1;
        int mid = p1;
        while(nums[p1] >= nums[p2]){
            if(p2 - p1 == 1){
                mid = p2;
                break;
            }

            mid = (p1 + p2) / 2;
            if(nums[mid] >= nums[p1])
                p1 = mid;
            if(nums[mid] < nums[p2])
                p2 = mid;
        }
        return nums[mid];
    }
}
