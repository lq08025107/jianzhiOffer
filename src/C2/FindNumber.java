package C2;

public class FindNumber {
    /**
     * 要求：给定一个二维数组，二维数组行和列都递增，判断该数组中是否存在target这个数
     * 解题思路：从右上或左下开始，两个指针逐步缩小范围,必须选择可以缩小范围
     * @param array
     * @param target
     * @return
     */
    public static boolean find(int[][] array, int target){
        if(array == null || array == new int[][]{}) return false;
        boolean flag = false;
        int row = 0;
        int col = array[0].length - 1;
        while(row >= 0 && col >= 0 && row < array.length && col< array[0].length){
            if(array[row][col] == target){
                flag = true;
                break;
            }
            else if(array[row][col] > target)
                col--;
            else
                row++;
        }
        return flag;
    }
    public static void main(String[] args){
        int[][] array = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target = 15;
        boolean result = find(array,target);
        System.out.println(result);
    }
}
