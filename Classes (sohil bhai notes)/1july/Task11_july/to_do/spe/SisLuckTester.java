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

  //Date  01/02/2020
 public class SisLuckTester {

	public static void main(String args[]){
	  
	  double num  = Math.random();
	 final   int GENERATED_LUCK_NUMBER = (int) (num*100);//0-99  
	  
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	   int userNumber;
	   
	   System.out.println("enter number b/w 0-99 for you luck test"); 
	   userNumber =scan.nextInt();
	   
	   if(GENERATED_LUCK_NUMBER==userNumber){
	      System.out.println("your luck no need to work hard...");
	     System.out.println("enjoy your life ...");
	   }else{
	     System.out.println("Try again... all the best");
	   }
	  
	  System.out.println("Last generated number was " + GENERATED_LUCK_NUMBER);
	  
	}//end main

}//end class