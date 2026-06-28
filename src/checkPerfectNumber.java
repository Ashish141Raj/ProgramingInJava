import java.util.Scanner;

public class checkPerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        if(isPerfect(num)){
            System.out.println(num+" is a perfect number");
        }else{
            System.out.println(num+" is not a perfect number");
        }
    }
    public static boolean isPerfect(int n){
        int sum = 0;
        for(int i=1; i <= n-1;i++){
            if(n % i == 0){
                sum += i;
            }
        }
        if(sum == n){
            return true;
        }else{
            return false;
        }
    }
}
