import java.util.Arrays;

public class Project1 {

	public static void main(String[] args) {
		int arr1[] = { 56, 45, 67, 34, 23, 54 };
		String arr2[] = { "fifty six", "forty five", "sixty seven",
				"thirty four", "twenty three", "fifty four", };
		
	
	showData(arr1, arr2);
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	System.out.println("______________");
	showData(arr1, arr2);
	
		
	}

	private static void showData(int[] arr1, String[] arr2) {
		for (int pos = 1; pos <= arr1.length; pos++) {
			int num = arr1[pos-1];
			String word = arr2[pos-1];
			System.out.printf("#%-4d %-5d %-20s\n",pos,num,word);
		}
	}

}
