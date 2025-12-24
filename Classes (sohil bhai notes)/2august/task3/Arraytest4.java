public class Arraytest4{
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	System.out.println("how many element required");
/*	
	int size = scan.nextInt();
	int []arr=new int[size];
	
	System.out.println("****************************************");
	for(int pos=1;pos<=size;pos++){
	System.out.println("sno"+pos +"= " + arr[pos-1]);
	}
*/
System.out.println("____________________________________________");
		
	int []arr=new int[ scan.nextInt() ];
	System.out.println(arr);
	System.out.println("total element size "+"=" + arr.length);

	for(int pos=1;pos<=arr.length;pos++){
	System.out.println("sno"+pos +" = " + arr[pos-1]);
	}
	//CTE arr.length=10;
	
}
}