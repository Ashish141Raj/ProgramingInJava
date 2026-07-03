package DSA_In_Java.Array_In_Java;

import java.util.Scanner;

public class SumElement_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int s = input.nextInt();

        int[]arr = new int[s];

        int sum = 0;
        for(int i = 0; i<s; i++){
            System.out.print("Enter elements "+ " at index "+i+" : ");
            arr[i] = input.nextInt();

            sum += arr[i];
        }
        System.out.println("Sum of elements: "+sum);
    }
}
