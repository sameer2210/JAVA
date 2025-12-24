import java.util.Arrays;
public class Project1{

	public static void main(String args[]){
		int arr1[] = {45,65,78,32,22};
		String arr2[] = {"fourty five","sixty five","seventy eight",
								"thirty two","twenty two",};
	
	showData(arr1,arr2);
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println("____________________________");
		showData(arr1, arr2);
		
	}
	
	private static void showData(int[] arr1, String[] arr2){
		for(int pos=1; pos<=arr1.length; pos++){
			int num = arr1[pos-1];
			String word = arr2[pos-1];
			System.out.printf(" #%-4d %5d %-20s\n",pos,num,word);
		}
	}//end main
	
	
}//end class