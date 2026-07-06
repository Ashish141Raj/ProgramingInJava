/*find the first occurrences of a given element in a sorted array using binary search.*/
package DSA_In_Java.Array_In_Java.Binary_Search_array;

public class QuestionTwo {
    public static void main(String[] args) {
        int[] arr = {2,3,4,4,4,6,8};

        int n = arr.length;
        int target = 4;
        int s = 0;
        int e = n-1;
        int ans = -1;

        while(s <= e){
            int m = s+(e-s)/2;
            if(arr[m] == target){
                ans = m;
                e = m-1;
            }else if(arr[m] < target){
                s = m+1;
            }else {
                e = m-1;
            }
        }
        System.out.println(ans);
    }
}
