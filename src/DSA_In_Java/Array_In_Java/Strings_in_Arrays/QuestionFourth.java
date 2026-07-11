/*Count vowels and consonants and spaces in it. **/
package DSA_In_Java.Array_In_Java.Strings_in_Arrays;

import java.util.Scanner;

public class QuestionFourth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter String: ");
        String s = input.nextLine();
        int n = s.length();

        int vow =0;
        String vs = " ";
        int con =0;
        String cs = " ";
        int spc =0;
        for (int i = 0; i < n; i++) {
            char ch =Character.toLowerCase(s.charAt(i));
            if(ch == 'a' || ch =='e' || ch == 'i' || ch=='o' || ch=='u'){
                vs += ch;
                vow ++;
            }else if(ch >= 'a' && ch <= 'z'){
                cs += ch;
                con ++;
            }else if(ch == ' '){
                spc ++ ;
            }
        }
        System.out.println("Vowels: "+vs +"="+vow);
        System.out.println("Consonants: "+cs+"= "+con);
        System.out.println("Spaces: "+spc);
    }
}
