public class Stringdemo5 {
	public static void main(String args[]){
	
	String str1="java is simple";
	String arr1[] = str1.split(" ");
	System.out.println("str = " + str1);
	System.out.println("total word = "+arr1.length);
	System.out.println(java.util.Arrays.toString(arr1));
	System.out.println("___________________________________");
	
	String str2="jhethalal champaklal gada !! gada Electronics";
	String arr2[] = str2.split(" ");
	System.out.println("str = " + str2);
	System.out.println("total words = " +arr2.length);
	System.out.println(java.util.Arrays.toString(arr2));
	System.out.println("___________________________________");
	
	String str3="Sameer khan   aami,che,thumhar,chan,chan,chan";
	String arr3[] = str3.split(" ");
	System.out.println("total words = " + arr3.length);
	System.out.println(java.util.Arrays.toString(arr3));
	System.out.println("___________________________________");


}
}
