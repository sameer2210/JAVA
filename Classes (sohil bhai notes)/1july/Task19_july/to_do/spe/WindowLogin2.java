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
 public class WindowLogin2 {

	public static void main(String args[]){
	
	String userName  = System.getenv("USERNAME");
    System.out.println("User "+ userName);
	
	 java.util.Scanner scan  = new java.util.Scanner(System.in);
	 
	final String preDefinePassword="nitjavasis2020";//FILE /DB
	String userPassword=null;
	  do{
		 System.out.print("enter password>>");
		  userPassword= scan.next();
	  }while(preDefinePassword.equals(userPassword)==false);
	  
	  System.out.println("Welcome to Sis ");
	  
	}//end main

}//end class