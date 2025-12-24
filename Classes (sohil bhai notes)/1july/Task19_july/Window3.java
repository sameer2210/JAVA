public class Window3{
	public static void main(String args[]){
	
	
	final String preDefineUser="int";
	final String preDefinePassword="int123";
	
	String userId = null;
	String userPassword=null;

	java.util.Scanner scan=new java.util.Scanner(System.in);
	boolean isLoginSuccess=false;
	
	for(int attempt=1;attempt<=3;attempt++){
	System.out.println("attempt#" +attempt);
		System.out.print("enter user id>>");
		userId= scan.next();
		System.out.print("enter user Password>>");
		userPassword=scan.next();
		if(preDefineUser.equals(userId)&&preDefinePassword.equals(userPassword)){
			isLoginSuccess=true;break;
		}else{
			System.out.println("wrong userId or password");
			}
		}
		if(isLoginSuccess==false){
			System.out.println("user Blocked.......");
		}
		System.out.println("____________________________");
		System.out.println("Welcome user  "+userId);


}

}