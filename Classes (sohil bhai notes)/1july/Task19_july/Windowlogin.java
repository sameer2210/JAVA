public class Windowlogin{
	public static void main(String args[]){
	java.util.Scanner scan=new java.util.Scanner(System.in);

	String userName = System.getenv("USERNAME");
	System.out.println("User "+ userName);
	
	final String preDefinePassword="nitjavasis2020";
	  boolean isLoginSuccess=false;
	   do{
	     //get password
		System.out.println("enter password>>");
		String userPassword=scan.next();
		//check BE
		if(preDefinePassword.equals(userPassword)){
			isLoginSuccess=true;
		}else{
		  System.out.println("invalid password entered....");
		}
	}while(isLoginSuccess==false);
	System.out.println("Welcome to Sis");

}
}