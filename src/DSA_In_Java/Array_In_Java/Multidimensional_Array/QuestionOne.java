/*Write a java program to add two n X n matrices and print the resultant matrix.*/
package DSA_In_Java.Array_In_Java.Multidimensional_Array;

public class QuestionOne {
    public static void main(String[] args) {
        int [][]a = {{1,2},{3,4}};
        int [][]b = {{5,6},{7,8}};

        sumArray(a,b);
    }
    public static void sumArray(int[][] a,int[][] b){
        int r = a.length;
        int c = a[0].length;
        int [][]sum = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = a[i][j]+b[i][j];
            }
        }
        for(int i = 0; i < r; i++){
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
