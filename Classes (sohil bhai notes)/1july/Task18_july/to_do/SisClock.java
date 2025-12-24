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

  //Date  26/02/2020
 public class SisClock {

	public static void main(String args[])throws Exception{
	//boolean runAlways=true;
	 //while(runAlways){
	 
	 while(true){
	 
		Thread.sleep(1000);
		java.util.Date now  = new java.util.Date();
		String str  = ""  + now;
		//str  = str.substring(11,19);
		//System.out.println(str);
		//System.out.print(str);
	     str  = "\r"+str.substring(11,19);
		System.out.print(str);
		
	 }
	  
	}//end main

}//end class