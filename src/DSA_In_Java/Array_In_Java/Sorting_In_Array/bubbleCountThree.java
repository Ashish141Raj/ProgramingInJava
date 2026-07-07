/*Count the total number of swaps required to sort the array.
[4, 3, 2, 1]*/
package DSA_In_Java.Array_In_Java.Sorting_In_Array;

public class bubbleCountThree {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        countTotal(arr);

    }
    public static void countTotal(int []arr){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    count++;
                }
            }
        }
        System.out.println("Total number of Swaps Required is: "+count);
    }
}
