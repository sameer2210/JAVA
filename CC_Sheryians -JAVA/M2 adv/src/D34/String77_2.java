package D34;

public class String77_2 {
    private static boolean startsWith(String word, String prifex) {
        if (word.length() < prifex.length()) return false;
        for (int i = 0; i < prifex.length(); i++) {
            if (word.charAt(i) != prifex.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String words[] = {"pay", "attention", "practice", "attend"};
        String prifex = "at";
        int count = 0;
        for (String word : words) {
            if (startsWith(word, prifex)) count++;
        }
        System.out.println(count);
    }
}