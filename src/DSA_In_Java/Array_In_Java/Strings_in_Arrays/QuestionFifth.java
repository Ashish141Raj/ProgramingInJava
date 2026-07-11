/*Toggle each Character----> Means Capital -> Small or Small -> Capital*/
package DSA_In_Java.Array_In_Java.Strings_in_Arrays;

import java.util.Arrays;

public class QuestionFifth {
    public static void main(String[] args) {
        String s  ="Ashish RaJ";

        char arr[] = s.toCharArray();

        for (int i = 0; i <arr.length; i++) {
            char ch = arr[i];
            if(ch >= 'a' && ch <= 'z'){
                arr[i] = (char)(arr[i]-32);
            }else{
                arr[i] = (char)(arr[i]+32);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
