/*Count number of occurrences of a given element in an array*/
package DSA_In_Java.Array_In_Java.LinearSearch_Array;

public class QuestionThree {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6,5,6,9,6,6,6};

        int target = 6;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                count +=1;
            }
        }
        System.out.println("Element "+target+" occurrence is: "+count);
    }
}
