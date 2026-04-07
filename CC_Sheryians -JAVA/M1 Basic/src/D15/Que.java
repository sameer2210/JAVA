package D15;

public class Que {
    public static void main(String[] args) {


/*//   34 saparate integer digit

        int n = 123456;
        int rev = 0;
        while (n != 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        System.out.println(rev);
*/

/*//   35 sum of digit of a no.

        int n = 123;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println(sum);
*/

/*//   36 print int in reverse

        int n = 12345;
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(rev);
*/
/*
//   37 check pallindromic no. or not

        int n = 12231;
        int rev = 0;
        int tem = n;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(tem == rev ? "palidrom" : "not palidrom");
*/
/*
//   38 check a strong number or not(Sum of factorial of each digit)Ex- 145 = 1! + 4! + 5! = 145

        int n = 145;
        int tem = n;
        int fact = 1;
        int sum = 0;

        while (n != 0) {
            int rem = n % 10;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            fact = 1;
            n = n / 10;
        }
        System.out.println(tem == sum ? "strong" : "not strong");
*/
/*
        int n = 25;
        int tem = n;
        long sq = n * n;

        int c = 0;
        while (n != 0) {
            c++;
            n = n / 10;
        }
        long lastDigits = sq % (long) Math.pow(10, c);
        System.out.println(lastDigits == tem ? "auto" : "not auto");

//  OR

        int n = 25;
        int tem = n;
        long lastDigits = (n * n) % (long) Math.pow(10, (int) Math.log10(n)+1);
        System.out.println(lastDigits == tem ? "auto" : "not auto");
*/

    }
}
