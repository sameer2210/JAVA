package D40;

import java.util.Map;
import java.util.TreeMap;

public class Tree {
    public static void main(String[] args) {

//  85- Find the freqency of elements in an integer array
        int arr[] = {2, 3, 4, 2, 2, 2, 4, 7, 9, 1, 6, 7, 8, 9, 1, 3, 5, 7, 22};
        Map<Integer, Integer> map = new TreeMap<>();
        for (int key : arr) {
            if (map.containsKey(key)) {
                int val = map.get(key);
                val++;
                map.put(key, val);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);

/*  //or
        int arr[] = {2, 3, 4, 2, 2, 2, 4, 7, 9, 1, 6, 7, 8, 9, 1, 3, 5, 7, 22};
        Map<Integer, Integer> map = new TreeMap<>();
        for (int key : arr) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 0 + 1);
            }
        }
        System.out.println(map);
 */

/*  //or
        int arr[] = {2, 3, 4, 2, 2, 2, 4, 7, 9, 1, 6, 7, 8, 9, 1, 3, 5, 7, 22};
        Map<Integer, Integer> map = new TreeMap<>();
        for (int key : arr) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        System.out.println(map);
*/



        
    }
}
