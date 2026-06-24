import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Simple Calculator Using Switch");

        System.out.print("Enter 1st Number: ");
        double  no1 = input.nextDouble();

        System.out.print("Enter 2nd Number: ");
        double no2 = input.nextDouble();

        System.out.print("Enter operator(+,-,*,/): ");
        char operator = input.next().charAt(0);

        switch (operator){
            case '+' -> System.out.println("Result= "+(no1 + no2));
            case '-' -> System.out.println("Result= "+(no1 - no2));
            case '*' -> System.out.println("Result= "+(no1 * no2));
            case '/' -> System.out.println("Result= "+(no1/no2));
            default -> System.out.println("Invalid Operator");
        }
        input.close();
    }
}
