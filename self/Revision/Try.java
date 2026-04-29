package Revision;
import java.util.Arrays;

public class Try {
    public static void main(String[] args) {


        System.out.println("Array reverse");


        int arr[] = {1,2,3,4,5};

        int temp ;
        for (int i = 0; i<arr.length/2; i++){
            int j = arr.length - 1 - i;
                temp = arr[i];
                 arr[i] =  arr[j];
                 arr[j] = temp ;

        }
        System.out.println(Arrays.toString(arr));


    }
}
