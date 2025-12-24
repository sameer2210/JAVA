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
 public class Req2 {

	public static void main(String args[]) throws Exception{
	final int totalReqNumbers=10;
	int createdTotalNumber=1;
	while(createdTotalNumber<=totalReqNumbers){
	   Thread.sleep(1000);
	   int generatedNumber  = (int)(Math.random()*1000);  //0-999
	   System.out.println("sno"+createdTotalNumber +" = " + generatedNumber);
	   createdTotalNumber++;
	   
	}
	
	  System.out.println();
	  
	}//end main

}//end class