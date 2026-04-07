package D11;

public class Que {
    public static void main(String[] args) {
/*
//  26 table
        int n = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + " = " + n * i);
        }
*/
/*
//  27 sum upto n term

     int n=10;
     int sum = 0;
     for(int i=1; i<=n; i++){
         sum = sum+i;
        }
     System.out.println("sum of n No is " +sum );
*/
/*
//  28 factorial of no.

        int n = 3;
        int fact = 1;

        for (int i = 1; n >= i; n--) {
            fact = fact * n;
        }
        System.out.println(fact);
*/
/*
//   29 all even all odd values print

        int n = 20;
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; n >= i; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            } else {
                sumOdd = sumOdd + i;
            }
        }
        System.out.println("sum of all even = " + sumEven);
        System.out.println("sum of all odd = " + sumOdd);
*/

//---------------------------------------------------------------------------------------

/*
//    30  Print all the factors of a number.

        int n = 20;

        for(int i = 1; i<=n; i++){
            if(n%i ==0){
                System.out.println(i);
            }
        }
*/
/*
//   31 sum of all factors of a no.

        int n = 50;
        int sum = 0;
        int count =0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
               // count = count+1;  //or
                count++;
                sum = sum + i;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("counting = " + count);
*/
/*
//     32  number is Prime or not

        int n = 32;
        int count = 0;
        for (int i = 1; n >= i; i++) {
            if (n % i == 0) {
                count = count + 1;
            }
        }
        System.out.println(count == 2 ? "prime no " : "not prime no");
*/
/*
//   33 two input a,b and power a to the b

      int a =5;
      int b = 3;
      int multi = 1;

      for(int i=1; i<=b; i++){
         multi = multi * a;
      }
        System.out.println(multi);
*/
/*
//     negative value power

        int a = 2, b = -6;
        boolean isNeg = b < 0 ? true : false;
        b = Math.abs(b);
//        or
//        boolean isNeg = false;
//        if(b<0) {
//            isNeg = !isNeg;
//        }

        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans = ans * a;
        }
        System.out.println(isNeg ? 1.0 / ans : ans);
*/


    }
}
