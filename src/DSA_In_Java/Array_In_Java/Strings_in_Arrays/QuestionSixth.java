/*
2185. Counting Words With a Given Prefix.
Example 1:

Input: words = ["pay","attention","practice","attend"], pref = "at"
Output: 2
Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
Example 2:

Input: words = ["leet-code","win","loops","success"], pref = "code"
Output: 0
Explanation: There are no strings that contain "code" as a prefix.
*/
package DSA_In_Java.Array_In_Java.Strings_in_Arrays;

public class QuestionSixth {
    public static void main(String[] args) {
        String[] w = {"pay", "attention", "practice", "attend"};
        String pref = "at";
        int c =0;
        for (int i = 0; i < w.length; i++) {
            if(w[i].startsWith(pref)){
               c++;
            }
        }
        System.out.println(c);
    }
}
