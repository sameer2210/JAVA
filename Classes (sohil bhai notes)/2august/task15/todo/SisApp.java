/*
@Author:Surendra Kumar Sao
	>>Software Architect and Corporate Trainer
	>>+11 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 */

  //Date  26/08/2020
 public class SisApp {

	public static void main(String args[]){
	
	String [][] users ={
	     {"sis1","123","surendra"},
	     {"sis2","436","keshari"},
	     {"snit1","222","abhishek"},
	     {"snit2","123","jivan"},
	     {"snit3","444","rashmi"},
	     {"snit4","1234","aditya"},
	};
	/*System.out.println("total users " + users.length);
	for(int user=1;user<=users.length;user++){
	    //users[0][0]	    users[0][1]	    users[0][2]
	    // login id 			password 		name
		String loginId = users[user-1][0];
		String loginPassword = users[user-1][1];
		String name = users[user-1][2];
		System.out.printf("%-15s %-15s %-15s\n",loginId,loginPassword,name);
	}
	*/
	
	
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	String inputLoginId =null;
	String inputLoginPassword = null;
	
	System.out.print("Enter login id>>");
	inputLoginId=scan.nextLine();
	System.out.print("Enter login password>>");
	inputLoginPassword=scan.nextLine();
	
	
	String name = null;
	boolean isLoginSuccess=false;
	for(int user=1;user<=users.length;user++){
	    
		String loginId = users[user-1][0];
		String loginPassword = users[user-1][1];
		if(loginId.equalsIgnoreCase(inputLoginId) &&
			loginPassword.equals(inputLoginPassword) ){
		isLoginSuccess =true;
	   name = users[user-1][2];//save name for future use
		break;
		}
		
	}//loop
	
	
	if(isLoginSuccess==false){
	  System.out.println("invald userid or password");
	  return ;  //return type void 
	}
	
	//if true  follwing code execute 
	System.out.println("++++++++++++++++++++++++++++++++++");
	System.out.println("login successfuly");
	System.out.println("Welcome user "+name);
	System.out.println("++++++++++++++++++++++++++++++++++");
	java.util.Random rand  = new java.util.Random();
	java.util.Date now  = new java.util.Date();

	System.out.println("___________________");
    System.out.println("Sis App");
	System.out.println("welcome to sis ");
	System.out.println("date and time " +now);
	System.out.println("dice num " +  (rand.nextInt(6)+1));
	System.out.println("___________________");
	
	}//end main

}//end class