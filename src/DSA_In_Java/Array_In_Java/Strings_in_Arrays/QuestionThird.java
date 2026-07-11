//Check Palindrome in java
package DSA_In_Java.Array_In_Java.Strings_in_Arrays;

import java.util.Scanner;

public class QuestionThird {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String:- ");
        String s = input.next();
        String temp = s;
        int n = s.length();
        String rev = "";

        for (int i = n-1; i  >= 0; i--){
            rev += s.charAt(i);
        }
        if (temp.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
