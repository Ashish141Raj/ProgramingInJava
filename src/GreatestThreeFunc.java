import java.util.Scanner;

public class GreatestThreeFunc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();
        System.out.print("Enter third number: ");
        int n3 = input.nextInt();

        int result = greatestThree(n1,n2,n3);
        System.out.println(result+" is greatest");
    }
    public static int greatestThree(int a, int b, int c){
        int greatest = 0;
        if(a > b && a > c){
            greatest = a;
        }else if (b <= c) {
            greatest = c;
        } else {
            greatest = b;
        }
        return greatest;
    }
}
