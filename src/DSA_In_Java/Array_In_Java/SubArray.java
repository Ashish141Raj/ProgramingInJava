package DSA_In_Java.Array_In_Java;

public class SubArray {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,7,5};

        int target = 12;
        int sum = 0, count = 0;

        for(int i = 0; i < arr.length;i++){
            sum = 0;
            for(int j = i; j < arr.length;j++){
                sum+=arr[j];
                if(sum==target) count++;
            }
        }
        System.out.println(count);
    }
}
