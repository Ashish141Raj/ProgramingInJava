package DSA_In_Java.Array_In_Java;

public class Sum_Array_Elements {
    public static void main(String[] args) {
        int []arr = {1,2,3,5};
        int sum = 0;
        for(int i=0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of all elements: "+sum);
    }
}
