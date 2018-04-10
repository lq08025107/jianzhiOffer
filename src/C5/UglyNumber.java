package C5;

public class UglyNumber {
    public static int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        int factor2 = 2, factor3 = 3, factor5 = 5;
        for(int i=1;i<n;i++){
            int min = Math.min(Math.min(factor2,factor3),factor5);
            ugly[i] = min;
            if(factor2 == min)
                factor2 = 2*ugly[++index2];
            if(factor3 == min)
                factor3 = 3*ugly[++index3];
            if(factor5 == min)
                factor5 = 5*ugly[++index5];
        }
        return ugly[n-1];
    }

    public static boolean isUgly(int num) {
        if(num == 0) return false;
        while(num % 2 == 0)
            num = num / 2;
        while(num % 3 == 0)
            num = num / 3;
        while(num % 5 == 0)
            num = num / 5;
        if(num == 1) return true;
        return false;
    }

    public static void main(String[] args){
        System.out.println(nthUglyNumber(1200));
    }
}
