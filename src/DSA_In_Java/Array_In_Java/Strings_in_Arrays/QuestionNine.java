package DSA_In_Java.Array_In_Java.Strings_in_Arrays;

import java.util.Arrays;

/*Print each word of sentence in a new line.*/
public class QuestionNine {
    public static void main(String[] args) {
        String sen = "Hello Everyone I am Ashish From Muzaffarpur(Bihar)";
        PrintWord(sen);
    }
    public static void PrintWord(String sen){
        for (int i = 0; i < sen.length(); i++) {
            if(sen.charAt(i) == ' '){
                System.out.println();
            }else{
                System.out.print(sen.charAt(i));
            }
        }
    }
}
