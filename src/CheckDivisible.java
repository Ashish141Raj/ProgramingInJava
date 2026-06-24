import java.util.Scanner;

public class CheckDivisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if(num % 5 == 0 && num % 11 == 0){
            System.out.println(num+" is Divisible by 5 and 11 both");
        }else{
            System.out.println(num+" is Not divisible by 5 and 11 both ");
        }
    }
}
