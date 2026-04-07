package D34;

import java.util.Arrays;

public class String76 {
    public static void main(String[] args) {

/*//  76- Toggle each alphabet of String

//        String s = "SameeRKhaNDoN";
        String s = "Sam@& _+";

        String ans = "";
        for (char ch : s.toCharArray()) {
            ans += ch >= 'a' && ch <= 'z' ? (char) (ch - 32) : (char) (ch + 32);
        }
        System.out.println(ans);
*/

//  77- Take an array of strings words and a String Prefix.

        String words[] = {"pay", "attention", "practice", "attend"};
        String prifex = "at";
        int count = 0;
        for (String word : words) {
            if (word.startsWith(prifex)) {
                count++;
            }
        }
        System.out.println(count);

        String res[] = new String[count];
        int i = 0;
        for (String word : words) {
            if (word.startsWith(prifex)) {
                res[i++] = word;
            }
        }
        System.out.println(Arrays.toString(res));
        System.out.println("total words are " + Arrays.toString(words));


    }
}
