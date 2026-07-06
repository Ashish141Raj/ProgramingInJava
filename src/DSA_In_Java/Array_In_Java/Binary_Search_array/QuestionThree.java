/*Find the last occurrence of a given element in a sorted array using binary search.*/
package DSA_In_Java.Array_In_Java.Binary_Search_array;

public class QuestionThree {
    public static void main(String[] args) {
        int[] arr ={2,4,4,4,6,8};

        int target = 4;
        int s = 0;
        int e = (arr.length-1);
        int ans = -1;

        while(s <= e){
            int mid = s+(e-s)/2;
            if(arr[mid]==target){
                ans = mid;
                s = mid + 1;
            }else if(arr[mid] < target){
                s = mid + 1;
            }else{
                e =mid-1;
            }
        }
        System.out.println("last Occurrence is: "+ans);
    }
}
