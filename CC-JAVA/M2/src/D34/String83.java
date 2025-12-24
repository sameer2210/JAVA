package D34;

public class String83 {
    public static void main(String[] args) {

//   83- Sort the words of the sentence

        String s = "or bhai kya haal chaal hai";
        String words[] = s.split(" ");
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String t = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = t;
                }
            }
        }
        String ans = " ";
        for (String word : words) {
            ans = ans + word + " ";
        }
        ans = ans.trim();
        System.out.println(ans);


    }
}
