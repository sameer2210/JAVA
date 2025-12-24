import java.util.Arrays;
import java.util.Scanner;
	
public class Demo3 {
	public static void main(String [] args) throws Exception {
	int []arr1 = {6464,45,64,6,654,6,6546,64,5432,641,65631,};
	System.out.println(Arrays.toString(arr1));
	
	Scanner scan = new Scanner(System.in);
	int searchNumber = Integer.parseInt(scan.nextLine());
	//sequence search
	int foundIndex =-1;
	for(int p=1;p<=arr1.length;p++){
		if(searchNumber==arr1[p-1]){
			foundIndex =p-1;
			break;
		}
	}
	System.out.println(Arrays.toString(arr1));
	System.out.println("found index: "+ foundIndex);

	System.out.println("binary search\n");
	
	Arrays.sort(arr1);
	System.out.println("sorted....");
	System.out.println(Arrays.toString(arr1));
	int foundIndexWay2 = Arrays.binarySearch(arr1,searchNumber);
	//Note : return -ve index if no foun
	System.out.println("found index: "+ foundIndexWay2);

}
}