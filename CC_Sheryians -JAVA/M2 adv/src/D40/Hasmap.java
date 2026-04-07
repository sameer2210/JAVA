package D40;

import java.util.HashMap;
import java.util.Map;

public class Hasmap {
    public static void main(String[] args) {

        //store data in pair
        //key value should be diff
        //not maintain order
        //null bhi rakh sakte hai
        //two key value same so older key value replace

        int[] arr = {2, 4, 5, 6, 7, 8, 92, 34, 56, 78, 99, 345, 677, 889};
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(2, 4);           //used to add value
        map.put(3, 5);
        System.out.println(map);
        map.put(2, 54);
        System.out.println(map);    //remove old entry

        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "sameer");
        map1.put(9, "harsh");
        map1.put(2, "ashmit");
        map1.put(null, "faiz");
        map1.put(null, null);
        System.out.println(map1);


/*        int[] arr = {2, 3, 34, 6, 7, 8, 89, 1, 23, 5, 6, 8, 99, 0, 2, 3, 5};
        Map<Integer, Integer> map = new HashMap<>();
        for (int key : arr) {
            if (map.containsKey(key)) {
                int value = map.get(key);
                value++;
                map.put(key, value);
            } else
                map.put(key, 1);
        }
        System.out.println(map);
*/


    }
}
