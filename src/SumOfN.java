import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        int result = sumN(num);
        System.out.println("Sum = "+result);

    }
    public static int sumN(int n){
        int sum = 0;
        for(int i=1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}
