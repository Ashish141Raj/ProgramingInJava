/*
2. Sort the array [5, 1, 8, 3, 2] in descending order using Selection Sort.*/
package DSA_In_Java.Array_In_Java.Sorting_In_Array;

public class SelectionSortInDescending {
    public static void descendingOrder(int[]arr){
       int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int maxIdx = i;
            for(int j = i+1; j < n; j++){
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }


    }
    public static void main(String[] args) {
        int[]arr = {5, 1, 8, 3, 2};

        descendingOrder(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
