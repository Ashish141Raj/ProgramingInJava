package DSA_In_Java.Array_In_Java;

public class SecMax_ele_In_Array {
    public static void main(String[] args) {
        int []arr = {11,7,5,3,9};

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i=0;i< arr.length;i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            } else if (arr[i]>secMax) {
                secMax = arr[i];
            }
        }
        System.out.println("Maximum element in Array is: "+max);
        System.out.println("Second maximum element in Array is: "+secMax);
    }
}
