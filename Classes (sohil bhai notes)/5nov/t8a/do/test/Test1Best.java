public class Test1Best {
	public static void main(String args[]){
	
	int [] arr = {11,22,33};
	System.out.println(java.util.Arrays.toString(arr));
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	System.out.println(" which element pos value you want to fetch ");
	int pos = scan.nextInt();
	
	try{
			int value = arr[pos-1];
			System.out.println("pos " + pos + " = " + value);
	}catch(ArrayIndexOutOfBoundsException e){
		
			//System.out.println(" ERROR : " + e.getMessage());
			System.out.println(" ERROR : There is no element in this pos " + pos );
	}
	
	}//end main
}//end class