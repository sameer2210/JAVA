public class SisCal1 {
	public static void main(String args[]){
	
		String num1Str;
		String num2Str;
		int num1;
		int num2;
	
	num1Str = args[0];	// " 10 " ArrayIndex Out of boundsException
	num2Str = args[1];	// "20" ArrayIndex Out of Bound Exception
	
	num1 = Integer.parseInt(num1Str);	//Number FormatException
	num2 = Integer.parseInt(num2Str);	//Number FormatException
	
	int sum = num1 + num2;
	System.out.println(num1 + " + " + num2 + " = " + sum);
	
	System.out.println(" happy ending.... ");
	
	}//end main
}//end class