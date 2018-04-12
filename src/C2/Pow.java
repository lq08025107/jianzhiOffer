package C2;

import utils.Display;

public class Pow {
    public static double myPow(double x, int n){
        if(equals(x, 0.0)) return 0.0;
        int absn = 0;
        if(n < 0)
            absn = -n;


        double result  = 1.0;
        for(int i = 0; i < absn; i++){
            result = result * x;
        }

        if(n < 0)
            result = 1.0/result;
        return result;
    }
    public static boolean equals(double x1, double x2){
        if((x1 - x2 > -0.00001) && (x1 - x2 < 0.000001))
            return true;
        return false;
    }
    public double myPow1(double x, int n) {
        long m = n > 0 ? n : -(long)n;
        double ans = 1.0;
        while (m != 0) {
            if ((m & 1) == 1)
                ans *= x;
            x *= x;
            m >>= 1;
        }
        return n >= 0 ? ans : 1 / ans;
    }
    public static void main(String[] args){
        Display.showDouble(myPow(34.00515, -3));
    }
}
