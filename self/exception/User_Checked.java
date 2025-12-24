//  under age Exception
package exception;

public class User_Checked extends Exception{
	
	User_Checked(){
		super("you are Under age");
	}
	User_Checked(String message){
		super(message);
	}

/*
	public static void main(String[] args)throws Exception{

		int age = 16;
		if(age<18) {
			throw new User_Checked();
		}else {
			System.out.println(" welcome you can enter.....");
		}
*/		
		
	public static void main(String[] args){
			
		int age = 16;
			try {
				if(age<18) {
					throw new User_Checked();
				}else {
				System.out.println(" welcome you can enter.....");
				}
			}
			catch(User_Checked e){
				System.out.println(e);
				e.printStackTrace();
			}
		
	}

}
