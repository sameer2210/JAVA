package D39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> i = new ArrayList<>(2);
        i.add(22);
        list.add("sameer");
        list.clear();
        list.add("aayaush");
        list.contains("aa");
//        list.remove("er");
//        list.remove(2);
//        list.forEach();
        list.size();


        System.out.println(list);
        System.out.println(i);
        System.out.println(list.contains("a"));
        System.out.println(list.size());
    }
}
