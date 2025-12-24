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

  //Date  29/02/2020
 public class WindowLogin3 {

	public static void main(String args[]){
	final String preDefineUser="nit";//FILE /DB
	final String preDefinePassword="nit123";//FILE /DB
	
	String userId  = null;
	String userPassword=null;
	
    
	 java.util.Scanner scan  = new java.util.Scanner(System.in);
	 boolean isLoginSuccess=false;
	 
	 
	   for(int attempt=1;attempt<=3;attempt++){
	     System.out.println("attempt#"+attempt);
		 System.out.print("enter user id>>");
		 userId= scan.next();
		 System.out.print("enter password>>");
		 userPassword= scan.next();
		  if(preDefineUser.equals(userId) && preDefinePassword.equals(userPassword)){
			isLoginSuccess=true; break;
		  }else{
		     System.out.println("wrong userid or password");
		  }
		  
	  }
	  if(isLoginSuccess==false){
		System.out.println("user blocked....");
		return ;
	  }
	  
	  System.out.println("++++++++++++++++++++++++++++++");
	  System.out.println("Welcome user  "+userId);
	  System.out.println("++++++++++++++++++++++++++++++");
	  
	}//end main

}//end class