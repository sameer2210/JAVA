public class SisFormProcessorUtil {
	public static boolean submitForm(SisForm form){
			//validation
			//# form = null 1
			// name null
			// name ""
			// name "123"
			// name "123asb"
			// name "abcdefghijklmnopqrstuvwxyz"
			// name " a " 
			// name 2-30 char only
			
			// age -22
			// age 1000
			
			//EmptyNameException
			//InvalidNameException
			//LengthNameException
			//NegativeAgeException
			//AgeRangeException
			
			// all ok
			// store in db
			// return msg
			 return true;
	}
	
}