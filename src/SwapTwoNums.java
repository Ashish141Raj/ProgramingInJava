import java.util.Scanner;

public class SwapTwoNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int a = input.nextInt();

        System.out.print("Enter 2nd Number: ");
        int b = input.nextInt();
        System.out.println("Before Swapping");
        System.out.println("Value of A: "+a);
        System.out.println("Value of B: "+b);
        int c = a;
        a = b;
        b = c;
        System.out.println("After Swapping");
        System.out.println("Value of A: "+a);
        System.out.println("Value of B: "+b);


    }
}
