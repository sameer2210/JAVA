public class Studentstory {
	public static void main (String args[]) {
	
	String []result = new String [21];
	System.out.println(java.util.Arrays.toString(result));
	java.util.Arrays.fill(result,"success");
	System.out.println(java.util.Arrays.toString(result));
	System.out.println("___________________________________");
	
	char [] arr = new char[10];
	System.out.println(java.util.Arrays.toString(arr));
	java.util.Arrays.fill(arr,'*');
	System.out.println(java.util.Arrays.toString(arr));
	
	float arr2[] = new float[10];
	System.out.println(java.util.Arrays.toString(arr));
	java.util.Arrays.fill(arr2,100.0f);
	System.out.println(java.util.Arrays.toString(arr));

	System.out.println("___________________________________");

	int arrx[]={11,22,33,44,55};
	int arry[]={11,22,33,44,55};
	int arrz[]={11,22,33,44,55};
	System.out.println(java.util.Arrays.toString(arrx));
	System.out.println(java.util.Arrays.toString(arrx));
	System.out.println(java.util.Arrays.toString(arrz));
	System.out.println(java.util.Arrays.equals(arrx,arry));  //true
	System.out.println(java.util.Arrays.equals(arrx,arrz));  //true

}
}