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
 public class Life2 {

	public static void main(String args[]){
	
	   String happyOption = null;
	   java.util.Scanner scan  = new java.util.Scanner(System.in);
	   
	   System.out.println("are you happy? yes/no");
	   happyOption = scan.nextLine();
	   
	   //wrong logic if(happyOption =="yes"){
	   // Ok but ?? if("yes".equals(happyOption )){
	   if("yes".equalsIgnoreCase(happyOption )){
	      System.out.println("work more and and get more....");
	   }else{
	      System.out.println("unhappy then also work continue....");
		  System.out.println("we must not follow mood.....");
	   
	   }   
	}//end main

}//end class