package D39;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int arr[] = new int[128];
        boolean isAnagram = true;

        if (s1.length() != s2.length()) {
            System.out.println("not a Anangram");
        } else {
            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                arr[ch]++;
            }
            for (int i = 0; i < s2.length(); i++) {
                char ch = s2.charAt(i);
                arr[ch]--;
            }
            for (int a : arr) {
                if (a != 0) {
                    isAnagram = false;
                    break;
                }
            }
            System.out.println(isAnagram ? "anagram " : "not anagram");
        }


    }
}
