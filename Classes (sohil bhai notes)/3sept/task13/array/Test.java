import java.util.Arrays;
import java.util.Random;

public class Test {
	public static void main(String args[]){
	
	 int arr1[]={11,22,33,44,55,66,77,88,99,12,34,56,78,987,654};
	 int []arr2 = new int [10];
	 System.out.println(arr1.length);
	 System.out.println("common + " +Arrays.toString(arr1));
	 System.out.println("user no. + " +Arrays.toString(arr2));
	 Random rand = new Random();
	 
	 int[]pickIndexArr = new int [arr2.length];
	 Arrays.fill(pickIndexArr,-1);
	 System.out.println("pickIndexArr + " +Arrays.toString(pickIndexArr));
	 
	 int totalFillCount=0;
	 int currentFillIndex=0;
	 while(true){
		int pickIndex = rand.nextInt(arr1.length);
		boolean alreadyFound=false;
		
	//if pick index not exist then set
		for(int pos=1;pos<=pickIndexArr.length;pos++){
			int value = pickIndexArr[pos-1];
			if(pickIndex==value){
				alreadyFound=true;
				break;
			}
	//inner for
		if(alreadyFound==false){
		//fill if not exist
			pickIndexArr[currentFillIndex++] =pickIndex;
			totalFillCount++;
		}else{
			continue;
		}
		if(totalFillCount==10)break;
		}
	//while
	
	System.out.println("pickIndexArr +"+Arrays.toString(pickIndexArr));
	
	for(int p=1;p<=arr2.length;p++){
		arr2[p-1] = arr1[pickIndexArr[p-1]];
	}
	System.out.println("pickIndexArr +" +Arrays.toString(arr2));
	
		
		}//end
		
	}//end main
		
}//end class	