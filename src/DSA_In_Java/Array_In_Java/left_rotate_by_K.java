package DSA_In_Java.Array_In_Java;

import java.util.Arrays;
import java.util.Scanner;

public class left_rotate_by_K {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int []arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.print("Enter value of K: ");
        int k = input.nextInt();

        for(int j = 1; j <= k; j++){
            int temp =arr[0];

            for (int i = 1; i < n ; i++) {
                arr[i-1] = arr[i];
            }
            arr[n-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
