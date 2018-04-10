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

    public static int[] quick_sort(int[] array, int start, int end){
        if(start >= end)
            return array;
        int j = partition(array, start, end);

        quick_sort(array, start, j - 1);
        quick_sort(array, j + 1, end);
        return array;
    }

    private static int partition(int[] array, int left, int right){
        int i = left, j = right;
        int x = array[left];
        while(i < j){
            while(i < j && array[j] >= x)
                j--;
            if (i < j){
                array[i] = array[j];
                i++;
            }

            while(i < j && array[i] < x)
                i++;
            if(i < j){
                array[j] = array[i];
                j--;
            }

        }
        array[i] = x;
        return i;
    }

    public static int[] merge_sort(int[] array){
        int[] tmp = new int[array.length];
        sort(array, 0, array.length - 1, tmp);
        return array;
    }

    private static void sort(int[] array, int left, int right, int[] tmp){
        if(left < right){
            int mid = (left + right)/2;
            sort(array, left, mid, tmp);
            sort(array, mid+1, right, tmp);
            merge(array, left, mid, right, tmp);
        }
    }
    private static void merge(int[] arr, int left, int mid, int right, int[] tmp){
        int i = left;
        int j = mid + 1;
        int t = 0;
        while(i <= mid && j <= right){
            if(arr[i] <= arr[j])
                tmp[t++] = arr[i++];
            if(arr[i] >= arr[j])
                tmp[t++] = arr[j++];
        }
        while(i <= mid){
            tmp[t++] = arr[i++];
        }
        while(j <= right)
            tmp[t++] = arr[j++];
        t = 0;
        while(left <= right)
            arr[left++] = tmp[t++];
    }
    public static  int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }

        return count;
    }
    public static void main(String[] args){
        int[] x = new int[]{5,4,7,9,12,9,0,3};
        show(bubble_sort(x));
        show(insert_sort(x));
        show(quick_sort(x,0, x.length - 1));
        show(merge_sort(x));
        show(countPrimes(5));
    }

    public static void show(int[] x){
        for(int i: x){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void show(int x){

        System.out.println(x);
    }
}
