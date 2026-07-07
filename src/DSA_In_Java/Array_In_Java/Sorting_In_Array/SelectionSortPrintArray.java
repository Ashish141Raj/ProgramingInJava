/*
3. Print the array after every pass of Selection Sort for the array [64, 25, 12, 22, 11].*/
package DSA_In_Java.Array_In_Java.Sorting_In_Array;

public class SelectionSortPrintArray {
    public static void printArrayAfterEveryPass(int[]arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j= i+1; j < n; j++){
                if( arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            System.out.println("pass: "+(i+1));
            for(int num: arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[] arr={64, 25, 12, 22, 11};
        printArrayAfterEveryPass(arr);
    }
}
