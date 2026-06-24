import java.util.Scanner;

public class FindLargestThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st no: ");
        int no1 = input.nextInt();

        System.out.print("Enter 2nd no: ");
        int no2 = input.nextInt();

        System.out.print("Enter 3rd no: ");
        int no3 = input.nextInt();

        if(no1 > no2 && no1 > no3) System.out.println(no1+" is Largest");
        if(no2 > no3) System.out.println(no2+" is greater");
        else System.out.println(no3+" is greater");
    }
}
