import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Check Positive Negative and Zero");

        System.out.print("Enter value of Number: ");
        int num = input.nextInt();

        if(num > 0){
            System.out.println(num+" is positive");
        }else if(num < 0){
            System.out.println(num+" is negative");
        }else {
            System.out.println(num+" is Zero");
        }
    }
}
