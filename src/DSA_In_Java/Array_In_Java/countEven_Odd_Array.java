package DSA_In_Java.Array_In_Java;

import java.util.Scanner;

public class countEven_Odd_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of an array: ");
        int s = input.nextInt();

        int[]arr = new int[s];

        for(int i = 0; i < s; i++ ){
            System.out.print("Enter "+i+"st Element: ");
            arr[i] = input.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                evenCount += 1;
            }else{
                oddCount += 1;
            }
        }
        System.out.println("Even: "+evenCount);
        System.out.println("Odd: "+oddCount);
    }
}
