import java.util.Scanner;
public class StudentSisBooleanUtil_V3 {
	public static void main(String args[]){
	
		Scanner scan = new Scanner(System.in);
		//# get proper input boolean value from user
		String value = null;
	while(true){
		try{
			 System.out.println(" enter bool value yes ha true no na false ");
			 value = scan.nextLine();
			// if proper value come		//then exit loop
			boolean rv = SisBooleanUtil.parseBoolean(value);
			System.out.println(" Ok value " + rv + " str " + value );
			break;
			// ok here
		}catch(EmptyBooleanException e){
			System.out.println(" null / empty Error : " + e.getMessage());
		}catch(InvalidBooleanValueException e){
			System.out.println("wrong value Error : " + e.getMessage());
		}
	}//while
	
	System.out.println(" happy ending ..... ");
	
	}//end main
}//end class