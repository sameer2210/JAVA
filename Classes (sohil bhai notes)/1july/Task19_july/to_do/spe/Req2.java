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
 public class Req2 {

	public static void main(String args[]) throws Exception{
	   for(int reqNum=1;reqNum<=5;reqNum++){
	     Thread.sleep(1000);
		 
		 double temp = Math.random();
		 int num  = (int)(temp*100);//0-99
		 int ascii  = (num%26)  +65 ; //65-90
		 char ch  = (char)ascii;
		 
		 System.out.println("sno#" +reqNum+"  " +ascii +" = " +ch);
		 
	   
	   }
	   
	  
	  
	  
	  
	  
	  
	}//end main

}//end class