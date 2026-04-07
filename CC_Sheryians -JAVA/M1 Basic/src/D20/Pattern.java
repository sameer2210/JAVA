package D20;

public class Pattern {
    public static void main(String[] args) {

 /*
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
*/

/*  //  46 Right Triangle - Star

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
*/
/*  // 47 Right Triangle - Number

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
*/

        // 48- Right Triangle - Alphabet

        int n = 5;
        for (int i = 1; i <= n; i++) {
            char p = (char) 64;
            for (int j = 1; j <= i; j++) {
                p++;
                System.out.print(p + " ");
            }
            System.out.println();
        }


    }
}
