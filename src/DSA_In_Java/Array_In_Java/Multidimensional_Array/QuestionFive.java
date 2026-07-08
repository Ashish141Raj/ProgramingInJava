/*5. Search an Element in a Matrix (Medium)

Write a Java program to check whether a given element exists in a 2D array.

Example:

Input:
Matrix:
1 2 3
4 5 6
7 8 9

Search = 5

Output:
Element Found at (1,1)
*/
package DSA_In_Java.Array_In_Java.Multidimensional_Array;

import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int s = input.nextInt();

        int [][] arr = new int [s][s];


        for (int i = 0; i < s; i++) {
            System.out.println("Enter elements in row "+(i+1)+" : ");
            for (int j = 0; j < s; j++) {
                System.out.print("Element at column -> "+(j)+" : ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println();
        System.out.println("Original Array: ");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter element to Search: ");
        int Key = input.nextInt();

        System.out.println();
        printIdx(arr,Key);
    }

    public static void printIdx(int[][]arr,int Key) {
        int n = arr.length;
        boolean found =false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == Key){
                    System.out.print("Found Element at index at "+i+","+j+" ");
                    found = true;
                    break;
                }
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}
