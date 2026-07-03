package DSA_In_Java.Array_In_Java;

import java.util.Scanner;

public class findLargest_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size: ");
        int s = input.nextInt();

        int[] arr = new int[s];

        int max = arr[0];
        for (int i = 0; i < s; i++) {
            System.out.print("Enter element at "+i+" : ");
            arr[i] = input.nextInt();
            if(i == 0){
                max = arr[i];
            }else if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element is: "+max);
    }

}
