public class SisBooleanUtil {
	public static boolean parseBoolean(String value)throws Exception{
			//yas true ha = true
			//no false na = false
			//null NPE
			//other raise exception
			boolean temp=false;
			
	if(value==null){
		throw new NullPointerException(" boolean value must not be null ");
		// throw new EmptyBooleanException(" boolean value must not be null ");
	}
	if(" yes".equalsIgnoreCase(value)==true
		||"true".equalsIgnoreCase(value)==true
		||"ha".equalsIgnoreCase(value)==true){
		temp = true;
	}else if("no ".equalsIgnoreCase(value)==true
		||"false".equalsIgnoreCase(value)==true
		||"na".equalsIgnoreCase(value)==true){
		temp = false;
	}else{
		//throw Exception
		String errorMessage = " value must be yes true ha or no false na: given = " +value;
		throw new Exception(errorMessage);
		//throw new InvalidBooleanValueException(errorMessage);
	}
		return temp;
		
	}//end MAIN	
}//end class