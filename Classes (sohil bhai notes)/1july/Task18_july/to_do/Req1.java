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
 public class Req1 {

	public static void main(String args[])throws Exception{
		java.util.Scanner scan  = new java.util.Scanner(System.in);
		System.out.println("how many second required?");
		int totalSecond  =scan.nextInt();
	  while(totalSecond>=1){
		Thread.sleep(1000);
		System.out.println(totalSecond);
		totalSecond--;
	  }
	System.out.println("GO");
	  System.out.println();
	  
	}//end main

}//end class