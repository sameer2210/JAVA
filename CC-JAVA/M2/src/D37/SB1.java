package D37;

public class SB1 {

    public static String rev(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {

/*      String s = "123";
        Integer a = Integer.valueOf(s);
        Integer b = Integer.parseInt(s);
        int c = a.intValue();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
*/

/*//  String in reverse order
        String s = "Sameer";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String res = sb.toString();
 */

//  by method useing for loop
        String s = "Sameer_123";
        String ans = rev(s);
        System.out.println(ans);            //0r
        System.out.println(rev(s));


    }
}
