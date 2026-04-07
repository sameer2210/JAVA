package D17;

import java.util.Scanner;

public class Pra {
    public static void main(String[] args) {

/*//  even+ odd+ neg value sum

        int n;
        Scanner sc = new Scanner(System.in);
        int neg = 0, evenPos = 0, oddPos = 0;
        do {
            n = sc.nextInt();
            if (n > 0) {
                if (n % 2 == 0) evenPos += n;
                else oddPos += n;
            } else neg += n;
        } while (n != 0);
        System.out.println("Positive " + evenPos);
        System.out.println("Positive " + oddPos);
        System.out.println("negative " + neg);
*/

/* // n number of table...

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
            if (n > 0) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + "*" + i + "=" + (n * i));
                }
            }
        } while (n > 0);
*/

/* //    perfect sq. or not (ex 25 = 5*5)

        int n = 0;
        do {
            System.out.println("give any number to check perfect sq or not..");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            int x = (int) Math.sqrt(n);
            if ((x * x) == n)
                System.out.println("perfect sq...");
            else
                System.out.println("not a perfect sq..");
        } while (n > 0);
*/
/* // harshad number  ex(18 => 1+8 = 9 and 9/18 = 0)

        int n = 54;
        int sum = 0;
        int tem = n;

        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        if (tem % sum == 0)
            System.out.println("given no is  a harshad no");
        else
            System.out.println("it is not a harshad no.");
*/

    }
}
