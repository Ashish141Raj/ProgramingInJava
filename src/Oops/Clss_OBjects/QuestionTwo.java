/*Create a class calculator with methods:
* -add(int a, int b)
* -subtract(int a, int b)
* -multiply(int a, int b)
* Create an object and call all methods from main()*/
package Oops.Clss_OBjects;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator cal = new Calculator();

        System.out.print("Enter 1st Number: ");
        int a = input.nextInt();

        System.out.print("Enter 2nd Number: ");
        int b = input.nextInt();

        cal.display(a,b);


    }
}
class Calculator{
    public int sum(int a, int b){return (a+b);}
    public int sub(int a, int b){return (a-b);}
    public int multiply(int a,int b){return (a*b);}

    void display(int a, int b){
        System.out.println("Addition = "+sum(a,b));
        System.out.println("Subtract = "+sub(a,b));
        System.out.println("Multiplication ="+multiply(a,b));
    }
}