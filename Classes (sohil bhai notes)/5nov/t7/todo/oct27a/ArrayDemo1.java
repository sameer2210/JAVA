public class ArrayDemo1 {
	public static void main(String[] args) {
     int [] arr1  = new int[5];//4*5 = 20 bytes
	 System.out.println(arr1.length);
	 System.out.println(java.util.Arrays.toString(arr1));
	 
     int [] arr2  = new int[5000];
	System.out.println(arr2.length);
	 System.out.println(java.util.Arrays.toString(arr2));
	 	
		
	}
}
