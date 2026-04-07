package D20;

import java.util.Scanner;

public class Que {
    public static void main(String[] args) {

/* // 49 down right angle triangle

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("______________________________\n");

//        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
*/

/*// 50- Mirrored Right Triangle

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {              // print 0
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {                  // print *
                System.out.print("* ");
            }
            System.out.println();
        }
*/

/*// 51- Triangle

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
*/

/*// 52- V - Min Height = 3

         int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-1; j++) {
               if(i+j == n+1) System.out.print("* ");
                else System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == j) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
   System.out.println("________________________________________");

//        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 2 * n; j++) {
                if (i - j == 0 || i + j == 2*n) System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.println();
        }
*/

//   53- X

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) System.out.print("* ");
                else System.out.print("0 ");
            }
            System.out.println();
        }


    }
}
