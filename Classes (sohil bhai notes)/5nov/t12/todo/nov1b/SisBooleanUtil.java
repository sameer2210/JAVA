/*
   @author Surendra
 */
public class SisBooleanUtil {
     public static boolean parseBoolean(String value)
     throws EmptyBooleanException,InvalidBooleanValueException{
    	//yes true ha  = true
    	 //no false na  = false 
    	 //null NPE
    	 //other raise exception
    	 boolean temp =false;
    	 
    	 if(value==null ){
    		 throw new EmptyBooleanException("boolean value must not be null");
    		 
    	 }

    	 if(value.trim().isEmpty() ){
    		 throw new EmptyBooleanException("boolean value must not be empty");
    		 
    	 }
    	 
    	 if("yes".equalsIgnoreCase(value)==true 
    		||"true".equalsIgnoreCase(value)==true    			 
    		|| "ha".equalsIgnoreCase(value)==true){
    		temp =true;	
    	}else  if("no".equalsIgnoreCase(value)==true 
        		||"false".equalsIgnoreCase(value)==true    			 
        		|| "na".equalsIgnoreCase(value)==true){
        		temp =false;	
        }else{
        	//throw Exeption 
        	String errorMessage = "value must be yes true ha or no false na :given = "+value;
        	throw new InvalidBooleanValueException(errorMessage);
        	//throw new InvalidBooleanValueException(errorMessage);
        	
        }
    	 return temp;
     }
}
