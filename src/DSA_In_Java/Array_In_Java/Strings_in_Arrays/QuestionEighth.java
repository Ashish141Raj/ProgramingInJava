package DSA_In_Java.Array_In_Java.Strings_in_Arrays;

import java.util.Scanner;
//Le-et_code Qn 242(Valid Anagram)

class QuestionEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String st = input.nextLine();

        System.out.print("Enter second String: ");
        String st2 = input.nextLine();

        if (st.length() != st2.length()){
            System.out.println("Not Anagram");
            return;
        }

        int [] fr1 = new int[256];
        int [] fr2 = new int[256];

        for (int i = 0; i < st.length(); i++) {
            fr1[st.charAt(i)]++;
            fr2[st2.charAt(i)]++;
        }
        boolean flag = true;

        for (int i = 0; i < 256; i++) {
            if(fr1[i] != fr2[i]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Strings are Anagram");
        }else{
            System.out.println("Strings are not Anagram");
        }
    }
}
