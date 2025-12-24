package D38;

import java.math.BigInteger;

public class BigInteger1 {
    public static void main(String[] args) {

/*//  BigIneger demo
        BigInteger fact = new BigInteger("1");
        int n = 42;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(new BigInteger(Integer.toBinaryString(i)));
        }
        System.out.println(fact);
        System.out.println(fact.toString());
        System.out.println(fact.toString().length());
*/

//  print into reverse order
        long original = 123456789;
        String originalStr = Long.toString(original);         // Convert the long into a string
        String reversedStr = new StringBuilder(originalStr).reverse().toString(); // Reverse the string
        long reversedLong = Long.parseLong(reversedStr);      // Reconvert into long
        System.out.println(reversedLong);                     // Print the reversed long

// Or in short form

//        long original = 123456789;
//        long reversedLong = Long.parseLong(new StringBuilder(Long.toString(original)).reverse().toString());
//        System.out.println(reversedLong);


    }
}
