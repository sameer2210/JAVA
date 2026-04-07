package D10;

import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char cha = sc.next().charAt(0);
        char ch = Character.toLowerCase(cha);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(" it is a vowel");
        } else {
            System.out.println("it is a consonent");
        }


    }
}
