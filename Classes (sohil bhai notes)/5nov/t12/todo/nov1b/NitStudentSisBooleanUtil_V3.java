import java.util.Scanner;

/*
 * @author Gagan
 */
public class NitStudentSisBooleanUtil_V3 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 //# get proper input boolean value from user
		String value=null ;
		while(true){
			try{
				System.out.println("enter bool value yes ha true no  na false");
				value  = scan.nextLine();
				//if proper value come 	//then exit loop
				boolean rv = SisBooleanUtil.parseBoolean(value);
				System.out.println("OK value "+ rv  +" str "+value);
				break;
				//ok here
			}catch(EmptyBooleanException e){
				System.out.println("null/empty ERROR :" + e.getMessage());
			}catch(InvalidBooleanValueException e){
				System.out.println("Wrong value ERROR :" + e.getMessage());
			}
		}
		 
		
		System.out.println("Happy Ending .....");
		
		 
		 
		
	}

}
