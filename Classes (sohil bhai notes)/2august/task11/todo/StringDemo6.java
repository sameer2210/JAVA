public class StringDemo6 {
	public static void main(String[] args) {
		 
		String str1="java is simple";
		String arr1[] = str1.split(" ");
		System.out.println("str = " + str1);
		System.out.println("total word = "+arr1.length);
		System.out.println(java.util.Arrays.toString(arr1));
		System.out.println("___________________");
		String str2="ravi kumar yaday sita gita rita";//4
		String arr2[] = str2.split(" ");
		System.out.println("str2 = " + str2);
		System.out.println("total word = "+arr2.length);//6
		System.out.println(java.util.Arrays.toString(arr2));
		//[ravi, kumar, yaday, sita, gita, rita]
		System.out.println("___________________");
		
		String str3="ravi kumar yaday,sita,gita,rita";//4
		String arr3[] = str3.split(",");
		System.out.println("str3 = " + str3);
		System.out.println("total word = "+arr3.length);//6
		System.out.println(java.util.Arrays.toString(arr3));
		
		
	}
}
