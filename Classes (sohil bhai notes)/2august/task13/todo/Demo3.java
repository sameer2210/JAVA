import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		int []arr1 = {54,243,575,23,67,3454,2254,546,9};
		System.out.println(Arrays.toString(arr1));
		
		Scanner scan = new Scanner(System.in);
		int searchNumber  =Integer.parseInt(scan.nextLine()); 
		//sequence search
		int  foundIndex =-1;
		for(int p=1;p<=arr1.length;p++){
			if(searchNumber==arr1[p-1]){
				foundIndex =p-1;
				break;
			}
		}	
		System.out.println(Arrays.toString(arr1));
		System.out.println("found index: "+ foundIndex);
		
		
		System.out.println("binary search ");
		
		Arrays.sort(arr1);
		System.out.println("sorted...");
		System.out.println(Arrays.toString(arr1));
		int foundIndexWay2 = Arrays.binarySearch(arr1, searchNumber);
		//NOTE : return -ve index if no found
		System.out.println("found index: "+ foundIndexWay2);
		
		
	

	}

}
