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
 public class StringReq1 {

	public static void main(String args[]){
	 String name  =null ;
	 java.util.Scanner scan  = new java.util.Scanner(System.in);
	 
	 System.out.println("enter your name");
	 //name  = scan.next();
	 name  = scan.nextLine();
	 
	 System.out.println("Your name is  " + name);
	 System.out.println(" name total char=   " + name.length());
	  
	  System.out.println("___________________");
	  
	  String name2  = name.trim();
	  
	 System.out.println("Your name is  " + name2);
	 System.out.println(" name total char=   " + name2.length());
	  
	  
	}//end main

}//end class