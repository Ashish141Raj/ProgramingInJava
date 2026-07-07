package DSA_In_Java.Array_In_Java.Sorting_In_Array;

public class InsertionSort {
    public static void ascendingOrder(int [] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i -1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int num: arr){
            System.out.print(num+" ");
        }

    }
    public static void main(String[] args) {
        int [] arr = {12,11,13,5,6};
        ascendingOrder(arr);
    }
}
