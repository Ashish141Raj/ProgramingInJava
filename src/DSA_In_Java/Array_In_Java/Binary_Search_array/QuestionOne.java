package DSA_In_Java.Array_In_Java.Binary_Search_array;

public class QuestionOne {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12};

        int target = 18;
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m] == target){
                ans = m;
                break;
            }else if(arr[m] < target){
                s = m+1;
            }else{
                e=m-1;
            }
        }
        System.out.println(ans);
    }
}
