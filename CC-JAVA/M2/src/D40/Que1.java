package D40;

import java.util.HashMap;

public class Que1 {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 7, 8, 8, 1, 2, 4, 5, 7, 8, 5};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int oldValue = map.get(arr[i]);
                int newValue = oldValue + 1;
                map.put(arr[i], newValue);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);

    }
}
