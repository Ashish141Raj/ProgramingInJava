package DSA_In_Java.Array_In_Java;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int []arr = {1,23,3,4,5};
        int start = 0,end = arr.length-1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
