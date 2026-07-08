/*3. Rotate Matrix 90° Clockwise (Medium)

Write a Java program to rotate an n × n matrix by 90° clockwise without using an extra matrix.

Example:

Input:
1 2 3
4 5 6
7 8 9

Output:
7 4 1
8 5 2
9 6 3

*/
package DSA_In_Java.Array_In_Java.Multidimensional_Array;

import java.util.Scanner;

public class QuestionThird {
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
        System.out.println("Original Array: ");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        rotateArray(arr);
    }
    public static void rotateArray(int [][] arr){
        int n = arr.length;
        //transpose array first
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            System.out.println();
        }
        //reverse array
        for (int i = 0; i < n; i++) {
            int s=0;
            int e = n-1;

            while(s < e){
                int temp = arr[i][s];
                arr[i][s] = arr[i][e];
                arr[i][e] = temp;

                s++;
                e--;
            }

        }
        System.out.println("Array after rotate: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
