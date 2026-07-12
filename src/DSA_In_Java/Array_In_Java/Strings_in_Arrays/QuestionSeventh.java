/*frequency of each character in java*/
package DSA_In_Java.Array_In_Java.Strings_in_Arrays;

import java.util.Scanner;

public class QuestionSeventh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter String: ");
        String st = input.nextLine();

        int [] freq = new int[256];

        for(char ch: st.toCharArray()){
            freq[ch]++;
        }

        System.out.println("Frequency of elements");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0){
                System.out.println((char)i+" ->"+freq[i]);
            }
        }
    }
}
