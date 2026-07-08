/*2. Matrix Transpose (Easy)

Write a Java program to find the transpose of a matrix.

Example:

Input:
1 2 3
4 5 6
7 8 9

Output:
1 4 7
2 5 8
3 6 9
*/
package DSA_In_Java.Array_In_Java.Multidimensional_Array;

import java.util.Scanner;

public class QuestionSecond {
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
        System.out.println("Transpose Matrix:");
        transposeArray(arr);
    }
    public static void transposeArray(int [][]arr){
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
