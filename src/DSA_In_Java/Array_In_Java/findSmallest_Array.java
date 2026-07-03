package DSA_In_Java.Array_In_Java;

import java.util.Scanner;

public class findSmallest_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size: ");
        int s = input.nextInt();

        int[] arr = new int[s];

        for(int i = 0; i < s; i++){
            System.out.print("ENTER ELEMENTS AT "+i+": ");
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element: "+min);
    }
}
