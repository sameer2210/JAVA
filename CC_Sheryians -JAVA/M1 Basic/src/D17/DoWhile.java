package D17;

public class DoWhile {
    public static void main(String[] args) {
/*
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

*/
/*
        int ch = 0;
        System.out.println("give input = 2");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        do {
            ch = scan.nextInt();
            System.out.println("hello");
        } while (ch == 2);
*/

        String st;
        java.util.Scanner scan = new java.util.Scanner(System.in);
        do {
            st = scan.nextLine();
            System.out.println("hello");

        } while (st.equals("hii"));


    }
}