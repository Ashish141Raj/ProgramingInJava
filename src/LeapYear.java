import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Leap Year Program in Java");

        System.out.print("Enter a Year: ");
        int year = input.nextInt();

        if(year % 4 == 0 || year % 400 == 0 && year % 100 != 0){
            System.out.println(year + " is leap Year");
        }else{
            System.out.println(year + " is not leap year");
        }
    }
}
