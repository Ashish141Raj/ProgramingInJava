package DSA_In_Java.Array_In_Java;

import java.util.Arrays;
import java.util.Scanner;

public class right_rotate_by_k {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []arr = {1,2,3,4,5};

        int n = arr.length;
        System.out.print("Enter value of K: ");
        int k = input.nextInt();

        for(int j= 1;j<=k;j++){
            int temp = arr[n-1];
            for (int i = n-1; i > 0; i--) {
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
