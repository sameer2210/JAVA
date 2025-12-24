public class SisCal4 {
	public static void main(String args[]){
	
		String num1Str = null;
		String num2Str = null;
		int num1 = 0;
		int num2 = 0;
		int sum  =  0;
		
		try{
			 num1Str = args[0];	//"10" ArrayIndexOutOfBoundsException e
			 num2Str = args[1];	//"20" ArrayIndexOutOfBoundsException e
			 num1 = Integer.parseInt(num1Str); //No Format Exception
			 num2 = Integer.parseInt(num2Str); //No Format Exception
		}catch(ArrayIndexOutOfBoundsException e){
			 //System.out.println("Error Message : " + e.getMeassage()); 	// 0 1
			 System.out.println("Error Message : must required 2 arguments ");
			 System.exit(0);	
		}catch(NumberFormatException e){
			System.out.println("Error : Both argument must be integer type " );
			System.exit(0);
		}
		
		sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
	
	
	}//end main
}//end class