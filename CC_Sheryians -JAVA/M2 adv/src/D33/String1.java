package D33;

public class String1 {
    public static void main(String[] args) {

        String s1 = "some";
        char arr[] = {'s', 'o', 'm', 'e'};
        String s2 = new String(arr);
        String res = "";

//        System.out.println(s1);             //some
//        System.out.println(s2);             //some

//71- Accept a string from user and print its each character on a new line
        for (int i = 0; i < s1.length(); i++) {
            char s = s1.charAt(i);
            System.out.println(s);
        }

//72- Accept a string and print it in reverse order
        System.out.println("___________________________ in reverse ");

        for (int i = s1.length() - 1; i >= 0; i--) {
            System.out.println(s1.charAt(i));
        }

// 73- Check if the string is Pallindromic or not
        for (int i = s1.length() - 1; i >= 0; i--) {
            res = res + s1.charAt(i);
        }
        System.out.println(res);
        System.out.println(res.equals(s1) ? " pallindrome" : " not pallindrome ");           //if sommos then palidrome




/*
        String s = "hello Bhai Kya hall chal hai";
        String s1 = "hello";
        String s2 = "HELLO";
        String s3 = " ";
        String s4 = "   sa   ";

        System.out.println(s.concat("world"));
        System.out.println(s.contains("elo"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.endsWith("hai"));
        System.out.println(s.startsWith("hello"));
        System.out.println(s1.substring(1,3));                //index bw 1&3 (el)
        System.out.println(s1.substring(1));        //after 1 index (ello)
        System.out.println("_________________________________");

        System.out.println(s1.equalsIgnoreCase(s2));        // true
        System.out.println(s1.equals(s2));                  // false
        System.out.println(s.compareTo(s2));                //32
        System.out.println(s3.isBlank());                   // true = not ant char
        System.out.println(s3.isEmpty());                   // false  = space
        System.out.println(s4.trim());
*/


    }
}
