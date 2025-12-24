package D40;

import java.util.HashSet;
import java.util.Set;

public class Hasset {
    public static void main(String[] args) {
        //unique element only
        //add,remove,search in  O(1) TC
        // Hash=> set,map
/*
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.remove(2);
        set.contains(4);

        System.out.println(set);
*/

//  total character in string ?
//
//        String s = "sdjlajfqweoblksdfhgjldjf";
//        Set<Character> set1 = new HashSet<>();
//        for (char ch : s.toCharArray())
//            set1.add(ch);
//        System.out.println(set1.size());

        int arr[] = {2, 2, 4, 6, 8, 9, 3, 4, 5, 7, 8, 9, 23, 45, 77, 8, 9};
        Set<Integer> set2 = new HashSet<>();
//        for (int i : arr)         //or
        for (Integer i : arr)
            set2.add(i);
        System.out.println(set2);
        System.out.println("size = " + set2.size());

        System.out.println("-------------------OR-------------------");

//        for (int i : set2)      //or
        for (Integer i : set2)
            System.out.print(i + ", ");

        System.out.println("\n___________________OR__________________");

        set2.forEach(i -> System.out.print(i + ","));

    }
}
