/*Find all the indexes of a given element in an array.*/
package DSA_In_Java.Array_In_Java.LinearSearch_Array;

public class QuestionFour {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9,10,10};

        int target = 10;
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                idx = i;
                System.out.println("found at "+idx+" ");
            }
        }
    }
}
