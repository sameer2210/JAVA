package D33;

//75- Count vowels , consonents  and space in a string
public class String75 {
    public static int[] count(String s) {
        int vowel = 0, consenent = 0, total = 0;
        s = s.toLowerCase();
        total = s.length();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> vowel++;
                default -> consenent++;
            }
        }
        return new int[]{total, vowel, consenent};
    }

    public static void main(String[] args) {
        String s = "hey sameer kya haal hai";
        int ans[] = count(s);
        System.out.println("total char = " + ans[0]);
        System.out.println("vowel = " + ans[1]);
        System.out.println("consenent = " + ans[2]);

    }

}
