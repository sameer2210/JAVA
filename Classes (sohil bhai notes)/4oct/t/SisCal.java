public class SisCal{
	public static void main(String args[]){
	
	String num1Str;
	String num2Str;
	int num1;
	int num2;
	
	num1Str = args[10];
	num2Str = args[20];
		
	num1 = Integer.parseInt(num1Str);
	num2 = Integer.parseInt(num2Str);
	
	int sum = num1 + num2;
	float div = (float)num1 / num2;
	System.out.println(num1 + " + " +num2 + " = " + sum);
	System.out.println(num1 + " + " + num2 + " = " + div);
	
	System.out.println("happy ending ");
		
	
	}//end main
}//end class