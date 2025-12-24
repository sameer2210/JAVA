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
 public class WindowLogin {

	public static void main(String args[]){
	
	String userName  = System.getenv("USERNAME");
    System.out.println("User "+ userName);
	
	 java.util.Scanner scan  = new java.util.Scanner(System.in);
	 
	final String preDefinePassword="nitjavasis2020";//FILE /DB
	 boolean isLoginSuccess= false;
	  do{
	     //get password 
		 System.out.print("enter password>>");
		 String userPassword= scan.next();
		 //check BE
		 if(preDefinePassword.equals(userPassword)){
			isLoginSuccess=true;
		 }else{
		   System.out.println("invalid password entered...");
		 }
		 
	  }while(isLoginSuccess==false);
	  
	  System.out.println("Welcome to Sis ");
	  
	}//end main

}//end class