public class SisUtil {

	public static boolean isValidNumberMethod1(int num){
			boolean temp = false;
			boolean c1 = num>=20&& num<=30;
			boolean c2 = num>=60&& num<=70;
		if(c1 || c2){
			temp=true;
		}else{
			//raise exception
			String msg=" value must be 20-30 or 60-70 : given " + num;
			NumberRangeException e = new NumberRangeException(msg);
			throw e;
		}
	return temp;
	}
	
	//best******
	public static boolean isValidNumberMethod2(int num)throws NumberRangeException{
			boolean temp = false;
			boolean c1 = num>=20&& num<=30;
			boolean c2 = num>=60&& num<=70;
		if(c1 || c2){
			temp = true;
		}else{
			//raise exception
			String msg =" value must be 20-30 or 60-70 :given " + num;
			NumberRangeException e = new NumberRangeException(msg);
			throw e;
		}
	return temp;
	}
	
}//end class