package exception;

public class User_Unchecked extends RuntimeException{
	
	User_Unchecked(){
		super("you are under Age");
	}
	User_Unchecked(String message){
		super(message);
	}

//---------------------------------------------------------------------
	
	public static void main(String[] args)throws Exception{
		
		int age = 16;
		if(age<18) {
			throw new User_Unchecked();
		}else {
			System.out.println("welcome .....");
		}
		
//---------------------------------------------------------------------------
		
/*		
		public static void main(String[] args) {

		int age = 16;
	try {
		if(age<18) {
			throw new User_Unchecked();
		}else {
			System.out.println("you are welcome....");
		}
	}
	catch(User_Unchecked e){
		System.out.println(e);
		e.printStackTrace();
	}
*/		
	}
}
