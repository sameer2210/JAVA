package D29;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {

/*//  sum of digonal
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int d1 = 0, d2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) d1 += arr[i][j];
                if (i + j == arr.length - 1) d2 += arr[i][j];
            }
        }
        System.out.println("sum of digonal1 " + d1);
        System.out.println("sum of digonal2 " + d2);
*/

/*//
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][];
        for (int i = 0; i < arr.length; i++) {
            int size = sc.nextInt();
            arr[i] = new int[size];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
*/


        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][2];
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "th row");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }


    }
}
