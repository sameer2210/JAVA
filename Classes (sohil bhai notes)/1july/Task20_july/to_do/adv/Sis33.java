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

  //Date  01/03/2020
 public class Sis33{

	public static void main(String args[]) throws Exception{
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	System.out.println("enter your text");
	
	String str=scan.nextLine();
	  for(int task=1;task<=str.length();task++){//ROW 
	     //sub task PartA
		 for(int print=1;print<=task;print++){//COL
				char ch  =str.charAt(print-1); 
				System.out.print(ch);
				Thread.sleep(20);
			}
	     //sub task PartB
		 for(int plus=1;plus<=str.length()-task;plus++){
				System.out.print("+");
		 
		 }
		 
	     //sub task PartC
		 System.out.print("\n");
	  
	  }
	  
	}//end main

}//end class