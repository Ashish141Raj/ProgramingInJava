import java.util.Scanner;

public class PrintNumbers1toN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Print Numbers from 1 to N");
        System.out.print("Enter value of Num: ");
        int num = input.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.println(i);
        }
        input.close();
    }
}
