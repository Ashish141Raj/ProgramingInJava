import java.util.Scanner;

public class CheckStrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int num = input.nextInt();
        if(isStrong(num)){
            System.out.println(num+" is a strong Number");
        }else{
            System.out.println(num+" is not a strong Number");
        }

    }
    public static int factorial(int n){
        int fact = 1;
        for(int i =1; i <= n; i++){
            fact *=i;

        }
        return fact;
    }
    public static boolean isStrong(int n){
        int temp = n;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += factorial(digit);
            n/=10;
        }
        return sum == temp;
    }
}
