package DSA_In_Java.Array_In_Java;

import java.util.Scanner;

public class secSmallest_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of an Array: ");
        int s = input.nextInt();

        int[]arr = new int[s];

        System.out.print("Enter elements: ");
        for(int i = 0; i < s; i++) {
           arr[i] = input.nextInt();
        }

        int min = arr[0];
        int secMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                secMin = min;
                min = arr[i];
            }else if(arr[i] < secMin && arr[i] != min){
                secMin = arr[i];
            }

        }
        System.out.println("Minimum element in Array is: "+min);
        System.out.print("Second_Minimum element is: "+secMin);
    }
}
