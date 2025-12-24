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
 public class StudentNumbers2 {

	public static void main(String args[]){
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	String allData="";
	
	final int  TOTAL_REQUIRED_NO=5;
	int totalInputNumber=1;
	
	while(totalInputNumber<=TOTAL_REQUIRED_NO){
	  //todo1 input
	  System.out.println("enter your number #"+totalInputNumber);
	  int inputNum = scan.nextInt();
	  
	  //todo2//process
	  java.util.Date now = new java.util.Date();
	  allData = allData +"sno#" +totalInputNumber +":"+inputNum+"  :: "+now+"\n";
	  //todo3 next counter update ++ 
	  totalInputNumber++;
	
	}//while end
	
	System.out.println("++++++++++++++++++++++++++++++");
	  System.out.println("all numbers are bellow:");
	  System.out.println(allData);
	System.out.println("++++++++++++++++++++++++++++++");
	  
	}//end main

}//end class