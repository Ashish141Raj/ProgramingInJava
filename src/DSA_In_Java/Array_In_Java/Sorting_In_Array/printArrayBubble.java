/*Print the array after every pass of Bubble Sort.
[7, 5, 3, 1]*/
package DSA_In_Java.Array_In_Java.Sorting_In_Array;

public class printArrayBubble {
    public static void printArrayEverySwaps(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("pass: "+(i+1));
            for(int num: arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,5,3,1};
        printArrayEverySwaps(arr);
    }
}
