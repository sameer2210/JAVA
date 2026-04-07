package D23;

import java.util.Arrays;

public class Que3 {
    public static void main(String[] args) {

/*  // type of for loop in arry form

        int[] arr = {2, 3, 4, 5, 7, 8, 9, 34, 55,6, 7, 79};

        for (int i = 0; i < arr.length; i++) {
            //task
        }
        //-------------------or---------------------or (for each loop)
        for (int a : arr) {
            //task
        }
*/

/*        //64- Move all the negative elements on left side and positive elements on right side with extra space in O(n).

        int[] arr = {2, -3, 5, -4, -6, 4, 3, 7, 25, 65, -64, 76};

        int i = 0, j = arr.length - 1;
        while (i < j) {
            while (i < arr.length && arr[i] < 0) i++;
            while (j >= 0 && arr[j] > 0) j--;
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        System.out.println(Arrays.toString(arr));
*/
    /*    int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
      */


//  66- Bubble Sort.

        int t = 0;
        int[] arr = {5, 4, 3, 7, 9, 7, 1, 8};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));



    }
}
