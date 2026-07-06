package DSA_In_Java.Array_In_Java.LinearSearch_Array;

public class QuestionTwo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,78};

        int target = 78;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
