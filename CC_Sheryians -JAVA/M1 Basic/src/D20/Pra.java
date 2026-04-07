package D20;

import java.util.Scanner;

public class Pra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

/*  //  neon no. 9 = 81(8+1)

        int n = sc.nextInt();
        int sum = 0;
        int sq = n * n;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        if (sum == n) System.out.println("neon no");
        else System.out.println("not neon no");
//        System.out.println((sum == n) + " neown no");     // or
*/

/*  //  fabinacho no

        int n = sc.nextInt();
        int first = 0, second = 0, sum = 0;
        int index = 2;
        for (int i = 1; i < n * 2; i++) {
            int third = first + second;
            first = second;
            second = third;
//            if (i % 2 == 0) sum += third;
            if (index % 2 == 0) sum += third;
            index++;
        }
        System.out.println(sum);
*/

  // mountain 90`

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
/*//  Or
        int n = 5;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int max = i <= n ? i : 2 * n - i;
            for (int j = 1; j <= max; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

*/
/*

        int n = 5;
        for (int i = 0; i <= 2 * n; i++) {
            int max = i > n ? 2 * n - i : i;
            int sp = n - max;
            for (int j = 0; j < sp; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < max; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
*/


    }
}
