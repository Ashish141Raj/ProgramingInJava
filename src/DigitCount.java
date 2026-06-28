import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int obj = countDigits(num);
        System.out.println("Total Number of Digits in "+num+" is: "+obj);
    }
    public static int countDigits(int n){
        int count = 0;
        while(n > 0){
            count ++;
            n /= 10;
        }
        return count;
    }
}
