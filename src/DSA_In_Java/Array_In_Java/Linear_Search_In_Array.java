//Write a Program in java to search for a given elements in an array using linear search.

package DSA_In_Java.Array_In_Java;

import java.util.Scanner;

public class Linear_Search_In_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int size = input.nextInt();

        int[]arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter element"+(i)+": ");
            arr[i] = input.nextInt();
        }

        System.out.print("Enter element to search From an Array: ");
        int ele = input.nextInt();


        boolean found = false;

        for(int i = 0; i < size; i++){
            if(arr[i] == ele){
                System.out.println("Element found at index: "+i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element is not found");
        }
    }
}
