package Pra;

import java.util.Arrays;

public class P21 {
    public static void main(String[] args) {

/* // negative positive value sepration
        int[] arr = {2, -3, 5, -4, -6, 5};
        int i = 0, j = 0;
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

/*// sum of arr
        int[] arr = {2, 3, 4, 5, 6, 7};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
*/

/*//second max value
        int[] arr = {2, 3, 4, 5, 6, 7, 3, 5, 15, 12};
        int fmax = Math.max(arr[0], arr[1]);
        int smax = Math.min(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > fmax) {
                smax = fmax;
                fmax = arr[i];
            } else if (arr[i] > smax) smax = arr[i];
        }
        System.out.println(smax);
*/

/*//     reverse order
        int[] arr = {2, 3, 4, 5, 6, 7, 3, 5, 15, 12};
        int temp[] = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            temp[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(temp));
*/

/* // reverse without any memory swape
        int[] arr = {2, 3, 4, 5, 6, 7, 3, 5, 15, 12};
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
            System.out.println(Arrays.toString(arr));
        }
*/



    }
}