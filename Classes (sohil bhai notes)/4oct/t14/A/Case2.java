public class Case2{
	public static void main(String args[]){
	
		int a = 10;	//primitive no methods
		
		//object has methods
		Integer iOb = new Integer(a);
		
			// byte b = a;	//CTE
			// String s = a;	//CTE
			
		byte b = iOb.byteValue();
		short st = iOb.shortValue();
		float ff = iOb.floatValue();
		long ll = iOb.longValue();
		double dd = iOb.doubleValue();
		String s = iOb.toString();
		
	
	}//end main
}//end class