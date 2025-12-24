public class Sreq {
	public static void main(String args[]){
	
	String str=new String ("ADCBE");
	System.out.println("str = " + str);
	System.out.println("str.length() = " + str.length());
	
	//Step1
	char []charArr = str.toCharArray();
	System.out.println("charArr" + charArr);
	System.out.println("charArr" + java.util.Arrays.toString(charArr));
	System.out.println("charArr.length=" + charArr.length);

	//STEP2 sort
	java.util.Arrays.sort(charArr);
	System.out.println("after sort charArr " + java.util.Arrays.toString(charArr));
	
	//step3 convert char [] to String
	String str2 = new String (charArr);
	System.out.println("str2 = " + str2);
	
}
}