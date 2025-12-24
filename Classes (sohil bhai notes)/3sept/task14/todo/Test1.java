import java.util.Arrays;
import java.util.Random;


public class Test1 {

	public static void main(String[] args) {
	 int arr1[]={11,22,33,44,55,66,77,88,99,12,23,43,567,878,89};
	 int []arr2 = new int [10];
	 System.out.println(arr1.length);
	 System.out.println("common +"+Arrays.toString(arr1));
	 System.out.println("user number +"+Arrays.toString(arr2));
	 Random rand = new Random();
	 
	 int[]pickIndexArr = new int [arr2.length];
	 Arrays.fill(pickIndexArr,-1);
	 System.out.println("pickIndexArr +"+Arrays.toString(pickIndexArr));
	 
	 
	  int totalFileCount=0;
	  int currentFillIndex=0;
	 while(true){
		 int pickIndex = rand.nextInt(arr1.length);//0-14
		 boolean alreadyFound=false;
		 
		 //if pick index not exist then set 
		    for(int pos=1;pos<=pickIndexArr.length;pos++){
		    	int value  = pickIndexArr[pos-1];
		    	if(pickIndex==value){
		    		alreadyFound=true;
		    		break;
		    	} 
		    }//inner for
		    if(alreadyFound==false){
		    	//fill if not exist 
			    pickIndexArr[currentFillIndex++] =pickIndex;
			    totalFileCount++;
		    }else{ 
		    	continue;
		    }
			   
		    if(totalFileCount==10)break;
	 }//while
	 
	 System.out.println("pickIndexArr +"+Arrays.toString(pickIndexArr));
	 
	 for(int p=1;p<=arr2.length;p++){
		 arr2[p-1] = arr1[pickIndexArr[p-1]];
	 }
	 System.out.println("pickIndexArr +"+Arrays.toString(arr2));
	 
	}//main

}//class
