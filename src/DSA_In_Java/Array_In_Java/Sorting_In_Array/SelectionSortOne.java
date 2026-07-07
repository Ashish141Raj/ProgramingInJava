//1. Sort the array [29, 10, 14, 37, 13] in ascending order using Selection Sort.

package DSA_In_Java.Array_In_Java.Sorting_In_Array;

public class SelectionSortOne {
    public static  void SelectionSort(int []arr){
       int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                    if (arr[j] < arr[min]){
                        min = j;
                    }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        int [] arr ={29,10,14,37,13};
        SelectionSort(arr);

        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
