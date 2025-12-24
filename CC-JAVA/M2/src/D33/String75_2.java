package D33;

class pair {
    int vowel, consenant;

    public pair(int vowel, int consenant) {
        this.vowel = vowel;
        this.consenant = consenant;
    }
}
//record pair(int vowel, int consenant) { };      // if use this need not to create pair class..

public class String75_2 {
    public static pair count(String s) {
        int vowel = 0, consenant = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> vowel++;
                default -> consenant++;
            }
        }
        return new pair(vowel, consenant);
    }

    public static void main(String[] args) {
        String s = "qwertyuiopasdfghjklzxcvbnm";
        pair ans = count(s);
        System.out.println("vowel = " + ans.vowel);             // record  vowel();
        System.out.println("consenant = " + ans.consenant);     // record  consenant();
    }
}
