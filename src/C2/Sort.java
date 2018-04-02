package C2;

public class Sort {
    public static int[] bubble_sort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] <= array[j]){
                    int x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }

        return array;
    }

    public static int[] insert_sort(int[] array){
        for(int i = 1; i < array.length; i++){
            int j;
            int temp = array[i];
            for(j = i - 1; j >= 0; j--){
                if(array[j] < temp){
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = temp;
        }
        return array;
    }

    public static void main(String[] args){
        int[] x = new int[]{5,4,7,9,12,9,0,3};
        show(bubble_sort(x));
        show(insert_sort(x));
    }

    public static void show(int[] x){
        for(int i: x){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
