package DSA_In_Java.Array_In_Java;

public class Array_Sorted {
    public static void main(String[] args) {
        int []arr = {7,9,11,12,15};
        boolean sorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
