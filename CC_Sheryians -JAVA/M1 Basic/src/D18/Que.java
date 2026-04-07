package D18;

import java.util.Scanner;

public class Que {
    public static void main(String[] args) {

//  43 vowel or not

        System.out.println("give any alphabet to check it is vowel or not");
        Scanner scan = new Scanner(System.in);
        char sc = scan.nextLine().charAt(0);
/*
        switch (sc) {
            case ('a'):
                System.out.println("vowel");
                break;
            case ('e'):
                System.out.println("vowel");
                break;
            case ('i'):
                System.out.println("vowel");
                break;
            case ('o'):
                System.out.println("vowel");
                break;
            case ('u'):
                System.out.println("vowel");
                break;
            default:
                System.out.println("not vowel");
        }
*/

        switch (sc) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(" it is a vowel ");
            default -> System.out.println("conensent .....");
        }


    }
}
