//Search an element in an array using Linear Search.
package DSA_In_Java.Array_In_Java.LinearSearch_Array;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of an array: ");
        int s = input.nextInt();

        int[]arr = new int[s];

        for (int i = 0; i < s; i++) {
            System.out.print("Enter Element at index "+i+" : ");
            arr[i] = input.nextInt();
        }

        System.out.print("Enter element to search: ");
        int ele = input.nextInt();
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ele){
                System.out.print("Element  at index "+i);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.print("Element not found");
        }
    }
}
