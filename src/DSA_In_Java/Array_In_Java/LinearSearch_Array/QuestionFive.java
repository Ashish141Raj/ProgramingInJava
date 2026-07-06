/*Find the first and  last occurrences of a given element in an array.*/

package DSA_In_Java.Array_In_Java.LinearSearch_Array;

public class QuestionFive {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,4,6};

        int target = 4;
        int firstOccur=-1;
        int lastOccur = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                if (firstOccur == -1){
                    firstOccur = i;
                }
                lastOccur = i;
            }
        }
        System.out.println("First=>"+firstOccur+" "+"last=>"+lastOccur);
    }
}
