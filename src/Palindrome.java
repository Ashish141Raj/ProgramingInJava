import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        int temp = num;

        int rev=0;
        while(num > 0){
            int digit = num % 10;
            rev = rev*10+digit;
            num = num/10;
        }
        if(temp == rev){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
