package DSA_In_Java.Array_In_Java.Sorting_In_Array;

import java.util.Arrays;

public class bubbleSortDescending {
    public static void descendingBubble(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] =  arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {8,3,6,9,2};

        descendingBubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
