package D34;

public class String81 {
    public static void main(String[] args) {

// 81- Accept a string and print the frequency of each character present in the string

        String s = "orbhaikyahallchaalhai";
        for (char i = 'a'; i < 'z'; i++) {
            int c = 0;
            for (char j = 0; j < s.length(); j++) {
                if (s.charAt(j) == i) c++;
            }
            if (c > 0) System.out.println(i + " -> " + c);
        }
        System.out.println("____________________or___________________");

//        String s = "orbhaikyahallchaalhai";
        int[] bitMap = new int[26];
        for (int i = 0; i < s.length(); i++) {
            bitMap[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            if (bitMap[i] > 0)
                System.out.println((char) (i + 97) + " -> " + bitMap[i]);
        }


    }
}
