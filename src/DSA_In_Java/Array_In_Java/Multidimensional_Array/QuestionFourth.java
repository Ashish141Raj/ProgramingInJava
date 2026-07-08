/*4. Find the Largest Element (Easy)

Write a Java program to find the largest element in a 2D array.

Example:

Input:
3 8 2
5 1 9
4 7 6

Output:
Largest Element = 9
*/

package DSA_In_Java.Array_In_Java.Multidimensional_Array;

import java.util.Scanner;

public class QuestionFourth {
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
        findLargestElement(arr);
    }
    public static void findLargestElement(int [][] arr){
        System.out.println();
        int n = arr.length;
        int lar = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] >lar) lar = arr[i][j];
            }
        }
        System.out.println("Largest element in Array: "+lar);;
    }
}
