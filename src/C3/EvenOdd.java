package C3;

import utils.Display;

public class EvenOdd {
    /**
     * 将所有奇数放在偶数前边
     * 常用位操作小技巧：
     * 1.判断奇偶            (i & 1)  ====================================> i % 2
     * 2.交换两数            int tmp = a; a = b; b = tmp;   ==============>  a ^= b; b ^= a; a ^= b;
     * 3.变换符号            11 变为 -11  =================================>  ~a + 1 取反加一
     * 4.abs              因此先移位来取符号位，int i = a >> 31;要注意如果a为正数，i等于0，为负数，i等于-1。然后对i进行判断——如果i等于0，直接返回。否之，返回~a+1。
     *   int i = a >> 31; return i == 0 ? a : (~a + 1);  简化为  int i = a >> 31; return ((a ^ i) - i);
     *
     * @param arr
     * @return
     */
    public static int[] recordEvenOdd(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            //一个数与0x1与操作，相当于跟2求余
            while((i < j) && (arr[i] & 0x1) != 0)
                i++;
            while((i < j) && arr[j] % 2 == 0)
                j--;
            if(i < j){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }

        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5};
        Display.showArray(recordEvenOdd(arr));
    }
}
