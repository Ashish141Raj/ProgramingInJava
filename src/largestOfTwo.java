import java.util.Scanner;

public class largestOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Find Largest of two numbers using Ternary");

        System.out.print("Enter Value of 1st Num: ");
        int a = input.nextInt();
        System.out.print("Enter Value of 2nd Num: ");
        int b = input.nextInt();

        int largest = (a > b) ? a : b;
        System.out.println(largest+" is largest Number");

        input.close();
    }
}
