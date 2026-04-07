package D38;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BuffReader_1 {
    public static void main(String[] args) throws Exception {

        InputStreamReader isr = new InputStreamReader(System.in);
        char ch = (char) isr.read();
        System.out.println(ch);



//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//        String s = br.readLine();
//        System.out.println(s);


    }
}
