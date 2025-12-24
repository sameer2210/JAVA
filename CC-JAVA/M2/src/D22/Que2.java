package D22;

import java.util.Arrays;

public class Que2 {
    public static void main(String[] args) {

/*//59- Array left Rotation by 1
        int[] arr = {1, 2, 3, 4, 5};
        int t = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = t;
        System.out.println(Arrays.toString(arr));
*/

/*
//60- Array left rotation by K elements

        int k = 63;
        int[] arr = {1, 2, 3, 4, 5};
        k = k % arr.length;
        while (k-- > 0) {
            int t = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
//                System.out.println(Arrays.toString(arr));
            }
            arr[arr.length - 1] = t;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("---------------------------");
        System.out.println(Arrays.toString(arr));
*/


/*//61- Array Reverse Without Using Extra space

        int arr[] = {1, 2, 3, 4, 5};
        int i = 0, j = arr.length - 1;
        while (i < j) {
            arr[i] = arr[j];
            arr[j] = i + 1;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
*/

/*//62- Linear Search an array - If element found print the index else -1

        int[] arr = {2, 3, 4, 5, 6, 7, 13, 34, 45, 4};
        int key = 4;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                System.out.print("found element in arry " + index + " \n ");
                break;
            } else System.out.println("not found! now next array is  " + index);
        }
*/

//63- Binary Search. If element found print the index else -1

        int key = 89;
        int[] arr = {2, 4, 7, 9, 14, 26, 57, 89, 99};
        int index = -1;
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                index = mid;
                break;
            }
            if (arr[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;
        }
        System.out.println("element found in array index " + index);

    }
}
