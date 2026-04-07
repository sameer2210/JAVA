package D33;

// 74- Pallindromic String using method and Two pointer algorithm (hint: Array reverse algo)
public class String2 {
    public static boolean isPallindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "madam";
        System.out.println(isPallindrome(s));

    }
}
