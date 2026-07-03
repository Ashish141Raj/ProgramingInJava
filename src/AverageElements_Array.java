import java.util.Scanner;

public class AverageElements_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int s = input.nextInt();

        int[]arr = new int[s];

        int sum = 0;
        float avg = 0;
        for(int i = 0; i < s; i++){
            System.out.print("Enter element at index "+i+" : ");
            arr[i] = input.nextInt();
            sum += arr[i];
            avg = sum/ arr.length;
        }
        System.out.println("Average of Elements: "+avg);
    }
}
