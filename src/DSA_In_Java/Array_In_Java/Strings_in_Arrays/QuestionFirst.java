/*Print each character of String in java*/
package DSA_In_Java.Array_In_Java.Strings_in_Arrays;

import java.util.Scanner;

public class QuestionFirst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String s = input.next();
//
//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
//        }
        for(char ch : s.toCharArray()){
            System.out.println(ch);
        }
    }
}
