package DSA_In_Java.Array_In_Java;

import java.util.Scanner;

public class secondLargest_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int s = input.nextInt();

        int[]arr = new int[s];

        System.out.print("Enter elements:" );
        for(int i = 0; i < s; i++){
            arr[i] = input.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            }else if(arr[i] > secMax){
                secMax = arr[i];
            }
        }
        System.out.println("Maximum is: "+max);
        System.out.println("Second Maximum is: "+secMax);

    }
}
