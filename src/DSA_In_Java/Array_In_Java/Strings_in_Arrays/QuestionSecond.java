//Reverse String in java.....
package DSA_In_Java.Array_In_Java.Strings_in_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionSecond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = input.next();

        char ch[] = s.toCharArray();
        int n = s.length();
//
//        for (int i = (s.length()-1); i >= 0; i--) {
//            System.out.print(s.charAt(i));
//        }

        /*Using of Two Pointer Concept.(Array)*/
        int st = 0;
        int en = n-1;

        while(st < en){
            char temp = ch[st];
            ch[st] = ch[en];
            ch[en] = temp;

            st++;
            en--;
        }
        System.out.println(Arrays.toString(ch));
    }
}
