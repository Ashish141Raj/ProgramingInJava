package DSA_In_Java.Array_In_Java;

import java.util.Scanner;

public class countPositiveNegativeZero_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int s = input.nextInt();

        int[] arr =  new int[s];

        for (int i = 0; i < s; i++) {
            System.out.print("Enter elements at "+i+" = ");
            arr[i] = input.nextInt();
        }
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                countPositive += 1;
            }else if(arr[i] < 0){
                countNegative += 1;
            }else{
                countZero += 1;
            }
        }
        System.out.println("Count positive="+countPositive+" count Negative= "+ countNegative+ " count zero= "+ countZero);
    }
}
