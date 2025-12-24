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

  //Date  02/02/2020
 public class Life3 {

	public static void main(String args[]){
	
	   java.util.Scanner scan  = new java.util.Scanner(System.in);
	   
	   System.out.println("are you happy? y/n");
	   //get input from user then trim it then get first char
	   String temp = scan.nextLine();  //"   Y   "
	   temp = temp.trim();//"Y"
	   temp = temp.toLowerCase();//"y"
	   char happyOption  = temp.charAt(0);  //'y'
	     
	   
	 
	   if( 'y'==happyOption){
	      System.out.println("work more and and get more....");
	   }else{
	      System.out.println("unhappy then also work continue....");
		  System.out.println("we must not follow mood.....");
	   
	   }
	}//end main

}//end class