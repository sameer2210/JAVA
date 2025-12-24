import java.util.Date;
import java.util.Arrays;
import java.util.Random;

public class Demo2 {
	public static void main(String [] args ) throws Exception {
	
	int []arr1 = {22,10,2001,143,15,66,2002,30,88,7};
	System.out.println(Arrays.toString(arr1));
	Arrays.sort(arr1);
	System.out.println(Arrays.toString(arr1));
	
	char []arr2 = {'a','b','c','d','e','f'};
	System.out.println(Arrays.toString(arr2));
	Arrays.sort(arr2);
	System.out.println(Arrays.toString(arr2));
	
	String []arr3 = {"jhethalal","champaklal","tapu","daya","tina","sonu","goli",};
	System.out.println(Arrays.toString(arr3));
	System.out.println(Arrays.toString(arr3));
	
	float []arr4 = { 12.3f,45.6f,78.9f,11.2f,33.4f,55.6f,77.8f,99.9f,22.5f,};
	System.out.println(Arrays.toString(arr4));
	Arrays.sort(arr4);
	System.out.println(Arrays.toString(arr4));

	int arrx[] = {12,34,56,78,99,11,22,33,44,55};
	System.out.println(Arrays.toString(arrx));
	Arrays.sort(arrx);
	System.out.println(Arrays.toString(arrx));

}
}