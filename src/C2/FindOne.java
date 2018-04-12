package C2;

import utils.Display;

public class FindOne {
    public static int findCountOne(int num) {
        int count = 0;
        while(num > 0){
            if((num & 1) != 0)
                count++;
            num = num >> 1;
        }
        return count;
    }
    //将一个数减1然后跟他本身位与，相当于将最右边的1变为0，这样做的好处是有几个1就循环几次
    public static int findCountOne1(int num){
        int count = 0;
        while(num > 0){
            ++count;
            num = (num - 1) & num;
        }
        return count;
    }

    public static int yihuo(int num){
        return num ^ 0x111;
    }
    public static void main(String[] args){
        Display.showInt(findCountOne(0x80000000));
        Display.showInt(yihuo(5));
    }
}
