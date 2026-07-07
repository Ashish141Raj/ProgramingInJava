/*Sort the Array in ascending order using bubble sort [5,2,9,1,7]*/
package DSA_In_Java.Array_In_Java.Sorting_In_Array;

import java.util.Arrays;

public class BubbleSortOne {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

}
