import java.util.Scanner;
//Create a method isPrime(int n) that returns true if the number is prime.
public class isPrime {
    public static boolean isPrimeNum(int n) {
        if(n <= 1){
            return false;
        }
        for(int i = 2; i<n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();

        if (isPrimeNum(num)){
            System.out.println(num+" is prime");
        }else{
            System.out.println(num+" is not prime");
        }
    }
}
