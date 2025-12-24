public class Window2 {
	public static void main(String args[]){
	java.util.Scanner scan=new java.util.Scanner(System.in);

	String userName = System.getenv("USERNAME");
	System.out.println("User "+userName);
	
	final String preDefinePassword="Sameer007";
	String userPassword=null;
	do{
		System.out.println("enter password>>");
		userPassword=scan.next();
	}while(preDefinePassword.equals(userPassword)==false);
	System.out.println("Welcome to Sis ");
	
}
}


























