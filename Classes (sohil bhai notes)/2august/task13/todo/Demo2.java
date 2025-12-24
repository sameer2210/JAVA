import java.util.Date;
import java.util.Arrays;
import java.util.Random;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		int []arr1 = {54,243,575,23,67,3454,2254,546,9};
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		char []arr2 = {'y','d','e','j','v','x'};
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));

		String []arr3 = {"rita","seema","ajay","guru","sumit","beena","chandan",};
		System.out.println(Arrays.toString(arr3));
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		
		float []arr4= {12.5f,67.45f,33.4f,99.8f,88.4f,34.6f,56.78f,23.65f,87.5f};
		System.out.println(Arrays.toString(arr4));
		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));
		
		int arrx[] ={12,36,54,56,68,34,67,78};
		System.out.println(Arrays.toString(arrx));
		Arrays.sort(arrx);
		System.out.println(Arrays.toString(arrx));
	}
}
