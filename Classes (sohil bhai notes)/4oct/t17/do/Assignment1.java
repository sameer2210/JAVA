import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {
	public static void main(String args[]){
	
		int[] arr1={5,2,1,3,4};
		String [] arr2={"five","two","one","three","four"};
		for(int pos=1; pos<=arr1.length; pos++){
			System.out.println("sno# "+pos+" "+arr1[pos-1]+" " + arr2[pos-1]);
		}
		//pos 2 4
/*			
	sno#1  5 five		
	sno#2	2 two*
	sno#3	1 one
	sno#4	3 three*
	sno#5	4 four
	
	sno#1	5 five
	sno#2	3 three*
	sno#3	1 one
	sno#4	2 two*
	sno#5	4 four
	
*/
	System.out.println("enter 2 swap row number ");
	Scanner scan = new Scanner(System.in);
		int pos1 =scan.nextInt();
		int pos2 =scan.nextInt();
	
		int temp = arr1[pos1-1];
		arr1[pos1-1]=arr1[pos2-1];
		arr1[pos2-1]=temp;
		
		String temp2 = arr2[pos1-1];
		arr2[pos1-1]=arr2[pos2-1];
		arr2[pos2-1]=temp2;
		
		System.out.println("__________________");
		for(int pos=1; pos<=arr1.length; pos++){
			System.out.println(" sno# " +pos + " " + arr1[pos-1]+ " " +arr2[pos-1]);
		}
		
	}//end main
}//end class 