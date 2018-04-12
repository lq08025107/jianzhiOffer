package utils;

public class Display {
    public static void showInt(int x){
        System.out.println(x);
    }
    public static void showArray(int[] x){
        for(int i: x){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void showString(String x){
        System.out.println(x);
    }

    public static void showDouble(Double x){
        System.out.println(x);
    }

}
