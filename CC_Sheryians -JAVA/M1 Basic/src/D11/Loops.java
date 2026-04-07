package D11;

public class Loops {
    public static void main(String[] args) {

/*
//  23 print hello n time

     int n = 7;
     for(int i=1; i<=n; i++){
         System.out.println("hello");
     }
*/
/*
//  24 print natural no

        int n = 20;
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
*/

/*//  25 reverse loop

        int n = 1;
        for (int i = 10; n <= i; i--) {
            System.out.println(i);
        }
*/

        for (char i = 1; i >= 0; i++) {
            System.out.print(i);
            if (i % 40 == 0) {
                System.out.println();
            }
        }


    }
}
