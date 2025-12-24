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
 public class MindTable {

	public static void main(String args[])throws Exception{
	
	 for(int r=1;r<=10;r++){
	     for(int c=1;c<=10;c++){
		    System.out.printf("%5d",r*c);
			Thread.sleep(10);
		 }
		 System.out.print("\n");
	 }
	  
	  System.out.println("__________________");
	   for(int r=11;r<=20;r++){
	     for(int c=101;c<=110;c++){
		    System.out.printf("%5d",r*c);
			Thread.sleep(10);
		 }
		 System.out.print("\n");
	 }
	  
	}//end main

}//end class