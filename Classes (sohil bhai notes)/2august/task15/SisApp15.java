public class SisApp15 {
	public static void main (String args[]) {
	
	String [][] users ={
		{"sis1","123","sameer"},
		{"sis2","456","shriram"},
		{"snit1","111","piyush"},
		{"snit2","222","aayush"},
		{"snit3","333","rohit"},
		{"snit4","1234","janifar"},
	};
	/*
	System.out.println("total users " + users.length);
	for(int user=1;user<=users.length;user++){
	//users[0][0]	users[0][1]	users[0][2]
	//login id				password
		String loginId = user[user-1][0];
		String loginPassword = users[user-1][1];
		String name = nsers[user-1][2];	
		System.out.printf("%-15s %-15s %-15s \n",loginId,loginPassword,name);
	}
	*/

	java.util.Scanner scan = new java.util.Scanner(System.in);
	String inputLoginId = null;
	String inputLoginPassword = null;
	
	System.out.print("Enter login id>>");
	inputLoginId=scan.nextLine();	
	System.out.println("Enter login password>>");	
	inputLoginPassword=scan.nextLine();
	
	String name = null;
	boolean isLoginSuccess=false;
	for(int user=1;user<=users.length;user++){
		String loginId = users[user-1][0];
		String loginPassword = users[user-1][2];
		if(loginId.equalsIgnoreCase(inputLoginId) &&
			loginPassword.equals(inputLoginPassword) ){
		isLoginSuccess =true;
	name = users[user-1][2];
		break;
		}
	}//loop
	
	if(isLoginSuccess==false){
	 System.out.println("invald userid or password");
	 return ;
	}
	
	//if true following code execute
	System.out.println("++++++++++++++++++++++++++++++\n");
	System.out.println("login successfuly");
	System.out.println("Welcome user "+name);		
	System.out.println("++++++++++++++++++++++++++++++\n");
	java.util.Random rand = new java.util.Random();
	java.util.Date now = new java.util.Date();
	System.out.println("\n____________________________");
	
	System.out.println("Sis App");
	System.out.println("Welcome to sis\ndate and time "+ now);
	System.out.println("dice num " + (rand.nextInt(6)+1));
	System.out.println("____________________________\n");
}
}