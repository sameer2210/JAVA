package D22;

import java.util.Scanner;
import java.util.Arrays;

public class Que {
    public static void main(String[] args) {

/*//54 - Accept size n from user and create a n size array then take n inputs (Print the sum & Mean of all elements)

        int sum = 0;
        double mean = 0.0d;
        System.out.println("Enter input how many Inputs want to give ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("give inputs....");
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        mean = sum / n;
        System.out.println("the sum of all values are " + sum);
        System.out.println("mean of all values is " + mean);
*/

/*//55- Find the greatest element and print its index too.{2, 96, 69, 77, 145, 20} = Max element = 145 found at 4 index

        int maxI = 0;
        int[] arr = {2, 96, 69, 77, 145, 20};

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxI])
                maxI = i;
        }
        System.out.println("greatest no is " + arr[maxI] + " index is " + maxI);
*/

/*//56- Find the second greatest element {2, 96, 69, 77, 145, 20} = Second greatest element = 96

        int arr[] = {99, 99, 89, 56, 7, 8, 8, 9};
        int first = Math.max(arr[0], arr[1]);
        int second = Math.max(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                second = arr[i];
            }
        }
        System.out.println("first =" + first);
        System.out.println("second =" + second);
*/
        //OR

        int arr[] = {99, 99, 89, 56, 7, 8, 8, 9};
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secmax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secmax) {
                secmax = arr[i];
            }
        }
        System.out.println(secmax);

/*//57- Check if array is sorted in increasing order or not.

        int[] arr = {2, 96, 69, 77, 145, 20};    // int[] arr = {2,5,7,9,15,45};
        boolean isShorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isShorted = !isShorted;
                break;
            }
        }
        System.out.println(isShorted ? "shorted" : "not shorted");
*/

/*// 58- Take n integer inputs store them in an array, copy all the elements in an another array but in reverse order and print it.

        int[] arr = {2, 5, 6, 8, 3, 5, 4, 2, 13, 56};
        int[] temp = new int[arr.length];
        int j = 0, i = arr.length - 1;
        while (i >= 0) {
            temp[j++] = arr[i--];
        }
        System.out.println(Arrays.toString(temp));

        System.out.println("-----------------or------------------");

        for (int k = 0; k < temp.length; k++) {
            System.out.print(temp[k]);
        }
*/



    }
}