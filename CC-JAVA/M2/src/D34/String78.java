package D34;

public class String78 {
    public static void main(String[] args) {

        String sentance = "or bhai kya haal chal hai";

/*      StringTokenizer st = new StringTokenizer(sentance);
        while (st.hasMoreElements())
            System.out.println(st.nextToken());
        String words[] = sentance.split("aa");      // anything if" " then split fromm space
        System.out.println(Arrays.toString(words));
*/

 /*       // orther way to split
        String words[] = sentance.split(" ");
        for (String word : words)
            System.out.println(word);

*/
//  78- space seperated sentence and split in into words. Print each word on a new line with first letter capitalized.

        String words[] = sentance.split(" ");
        for (String word : words) {
            char ch = word.charAt(0);
            //  String first = Character.toString(ch).toUpperCase();
            String first = (" " + ch).toUpperCase();
            String second = word.substring(1);
            word = first + second;
            System.out.println(word);
        }


    }
}
