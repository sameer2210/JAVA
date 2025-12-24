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
 public class ConsoleTestBySis {

	public static void main(String args[]){

	java.io.Console  con = System.console();
	
	System.out.println("enter text1 which display");
	String str1  = con.readLine();
	
	System.out.println("enter text2 which not display");
	char passwordCharArr []   = con.readPassword();
	String str2  = new String(passwordCharArr);
	 
	System.out.println("input1 data was "+ str1);
	System.out.println("input 2data was "+ str2);
	
	
	  
	}//end main

}//end class