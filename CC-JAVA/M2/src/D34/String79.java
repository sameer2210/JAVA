package D34;

import java.util.Arrays;
import java.util.StringTokenizer;
//Ex - 	Hello bhai Kaise ho a   =   HellO BhaI KaisE HO A
public class String79 {
    public static void main(String[] args) {
        String sentence = "or bhai kya Haal chaal hai e";

/*        String words[] = sentence.split(" ");
        for (String word : words) {
            char w[] = word.toCharArray();
//            if (w[0] > 'z')
//                w[0] = (char) (w[0] - 32);
            w[0] = Character.toUpperCase(w[0]);
            System.out.println(new String(w));
        }
*/

//  79- capitalize first & last character of each word in sentence & print new sentence

        String words[] = sentence.split(" ");
        String ans = " ";
        for (String word : words) {
            ans = ans + capitalize(word) + " ";
        }
        ans = ans.trim();
        System.out.println(ans);
    }

    private static String capitalize(String word) {
        char arr[] = word.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        arr[arr.length - 1] = Character.toUpperCase(arr[arr.length - 1]);
        return new String(arr);
    }


}
