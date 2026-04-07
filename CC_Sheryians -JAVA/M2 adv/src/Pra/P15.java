package Pra;

import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*//15-find the summation of absolute differences of all pairs in the given array. (Input : arr[] = {1, 2, 3, 4} , Output: 10)
    //        Sum of = |2-1| + |3-1| + |4-1| + |3-2| + |4-2| + |4-3| = 10

        int arr[] = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j] - arr[i];

            }
        }
        System.out.println(sum);
*/

/*//16-Elements of both arrays are associated with each other i.e. the value of B[i] is linked to A[i] for all valid values of i.
    //  The task is to find the value min(a + b, c). Input: A[] = {3, 6, 4, 5, 6}, B[] = {‘a’, ‘c’, ‘b’, ‘b’, ‘a’} Output: 6
    //   Input: A[] = {4, 2, 6, 2, 3}, B[] = {‘b’, ‘a’, ‘c’, ‘a’, ‘b’}   Output: 5

        int[] A = {3, 6, 4, 5, 6};
        int[] B = {'a', 'c', 'b', 'b', 'a'};
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;
        int minC = Integer.MAX_VALUE;
        for (int i = 0; i < B.length; i++) {
            char ch = (char) B[i];
            switch (ch) {
                case 'a' -> minA = Math.min(minA, A[i]);
                case 'b' -> minB = Math.min(minB, A[i]);
                case 'c' -> minC = Math.min(minC, A[i]);
            }
        }
        System.out.println(Math.min(minA + minB, minC));
*/

/*//17-The First element is replaced by the multiplication of the first and second. The last element is replaced by multiplication of the last and second last.
        //Input  : arr[] = {2, 3, 4, 5, 6}    Output : arr[] = {6, 8, 15, 24, 30}

        int arr[] = {2, 3, 4, 5, 6};
        int temp[] = new int[arr.length];
        for (int i = 1; i < arr.length - 1; i++) {
            temp[i] = arr[i - 1] * arr[i + 1];
        }
        temp[0] = arr[0] * arr[1];
        temp[arr.length - 1] = arr[arr.length - 1] * arr[arr.length - 2];
        System.out.println(Arrays.toString(temp));
*/

/*//19-frequency of array

        int[] arr = {2, 1, 3, 6, 4, 5, 8, 7, 6, 4, 3, 2, 1, 7, 5};
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] != -1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = -1;
                    }
                }
                System.out.println(arr[i] + " apperars " + count + " time");
            }
        }
*/

//20-An array is balanced if the sum of the left half array elements is equal to the sum of right half. Ex arr= {1 3 1 2 4 3}.
    // 1 + 3 + 1 = 5 and  2 + 4 + 3 = 9 So this is unbalanced, to make it balanced add  4  in first half.

        int sum1 = 0, sum2 = 0;
        int[] arr = {1, 2, 1, 2, 1, 3};

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) sum1 += arr[i];
            else sum2 += arr[i];
        }
        System.out.println("array is not balanced by " + (sum1 - sum2));

    }
}
