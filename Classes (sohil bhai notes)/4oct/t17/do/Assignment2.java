import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String args[]){
	
	int[]	arr1={5, 2, 1, 3, 4 };
	String [] arr2={"five","two","one","three","four"};
			
		for(int pos = 1; pos<=arr1.length; pos++){
				System.out.println("sno# "+ pos + " " + arr1[pos-1] +" " + arr2[pos-1]);
		}
		for(int pos=1; pos<=arr1.length-1; pos++){
			for(int pos2=pos+1;pos2<=arr1.length;pos2++){				int a=arr1[pos-1];
				int b=arr1[pos2-1];
				if(a>b){
					int temp=arr1[pos-1];
					arr1[pos-1] = arr1[pos2-1];
					arr1[pos2-1]=temp;
						
					String temp2=arr2[pos-1];
					arr2[pos-1] = arr2[pos2-1];
					arr2[pos2-1]=temp2;

				  System.out.println(Arrays.toString(arr1)+" == "+Arrays.toString(arr2));				}//if
			}//for
		}//for
	
	System.out.println("________________");
	
	for(int pos=1; pos<=arr1.length; pos++){
		System.out.println(" sno# "+pos+" "+arr1[pos-1]+" " +arr2[pos-1]);
	}	
	
	}//end main
}//end class