public class SisCal8 {
	public static void main(String args[]){
	
		String num1Str = null;
		String num2Str = null;
		int num1 = 0;
		int num2 = 0;
		int sum  = 0;
		
	try{
			//get input
		num1Str = args[0];
		num2Str = args[1];
		//parse it
		num1 = Integer.parseInt(num1Str);
		num2 = Integer.parseInt(num2Str);
		//process it 
		sum = num1 + num2;
		//print it
		System.out.println(" num1 " + " + " + " num2 " + " = " + sum);
		
	}catch(ArrayIndexOutOfBoundsException e){
			//System.out.println("Error mes : " + e.getMessage());
		System.out.println("Error message : must required 2 argument ");
	}catch(NumberFormatException e){
		System.out.println("Error : Both argument must be integer type ");
	}catch(Exception e){
		System.out.println("unknow Error  " + e.getMessage());
	}
	
	System.out.println("______________________");
	System.out.println(" Happy Ending ... ");
	System.out.println("______________________");
		
	
	}//end main
}//end class