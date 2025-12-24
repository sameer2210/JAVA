
public class MeargeReq1 {
	public static void main(String args[]) {
	
	int[]arr1 ={12,34,56,78,99,11,45};
	int[]arr2 ={122,344,566,788,95,11,22,33,44,55,66};
	System.out.println(java.util.Arrays.toString(arr1));
	System.out.println(arr1.length);
	System.out.println(java.util.Arrays.toString(arr2));
	System.out.println(arr2.length);
	
	int newArraySize = arr1.length + arr2.length;
	int []mergeArr = new int[newArraySize];
	System.out.println(java.util.Arrays.toString(mergeArr));
	System.out.println(mergeArr.length);
	System.out.println("__________________________");
	int currentMeargeIndex=0;
	//shift arr1 data into new array
	for(int p=1;p<=arr1.length;p++){
		int data = arr1[p-1];
		//System.out.println(data);
		mergeArr[currentMeargeIndex] =data;
		currentMeargeIndex++;
	}
	
	System.out.println("____________sift1____________\n");
	System.out.println("new array = "+java.util.Arrays.toString(mergeArr));
	
	  //shift arr2 data into new array 
	  for(int p=1;p<=arr2.length;p++){
		int data = arr2[p-1];
		//System.out.println(data);
		mergeArr[currentMeargeIndex] =data;
		currentMeargeIndex++;
	  }
	
	System.out.println("____________sift2_____________\n");
	System.out.println("new array = "+java.util.Arrays.toString(mergeArr));
	

}
}
