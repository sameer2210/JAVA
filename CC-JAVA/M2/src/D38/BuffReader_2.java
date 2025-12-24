package D38;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BuffReader_2 {
    public static void main(String[] args) throws IOException {

/*//  sum of two int value
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
//        int b = Integer.parseInt(br.readLine());
        int b = Integer.valueOf(br.readLine());
        System.out.println(a+b);
*/


//  all datatype parse method

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte b = Byte.parseByte(br.readLine());
        short s = Short.parseShort(br.readLine());
        int i = Integer.parseInt(br.readLine());
        long l = Long.parseLong(br.readLine());
        Float f = Float.parseFloat(br.readLine());
//      java.lang.Float Float = java.lang.Float.parseFloat(br.readLine());

        Double d = Double.parseDouble(br.readLine());
        boolean bool = Boolean.parseBoolean(br.readLine());
        char ch = br.readLine().charAt(0);
        String str = br.readLine();


    }
}
