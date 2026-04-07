package D17;

import java.util.Scanner;

public class Que {
    public static void main(String[] args) {

//    41 calculator

        int ch = 0;
        do {
            System.out.println("give any no \n 1 for add \n 2 for multi \n 3 for division ");
            Scanner scan = new Scanner(System.in);
            int sc = scan.nextInt();
            System.out.println("a = ?");
            int a = scan.nextInt();
            System.out.println("b = ?");
            int b = scan.nextInt();

            if (sc == 1) {
                System.out.println("a+b = " + (a + b));
            } else if (sc == 2) {
                System.out.println("a*b = " + a * b);
            } else if (sc == 3) {
                System.out.println("a/b = " + a / b);
            } else {
                System.out.println("wrong input ! try again...");
            }
            System.out.println(" again press 1 to retry.....");
            ch = scan.nextInt();
        } while (ch == 1);








    }
}
