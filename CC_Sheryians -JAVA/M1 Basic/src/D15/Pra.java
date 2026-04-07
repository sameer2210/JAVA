package D15;

import java.util.Scanner;

public class Pra {
    public static void main(String[] args) {

//        user login

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

/*  //   first approach

        int t = Math.min(a, b);
        int ans = 1;
        for (int i = 2; i <= t; i++) {
            if (a % i == 0 && b % i == 0) ans = i;
        }
        System.out.println(ans);
*/

/*  //   second approach

        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        System.out.println(a);
*/









    }
}
