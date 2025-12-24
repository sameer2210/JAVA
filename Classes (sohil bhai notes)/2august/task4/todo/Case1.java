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

  //Date  17/03/2020
 public class Case1 {

	public static void main(String args[])throws Exception{
	
	  /* String [] dayList =null;   //declare
	   dayList = new String[7]; //create array object
	   //fill it 
	   dayList[0]="sun";
	   dayList[1]="mon";
	   dayList[2]="tue";
	   dayList[3]="wed";
	   dayList[4]="thu";
	   dayList[5]="fri";
	   dayList[6]="sat";
	   */
      String [] dayList={"sun","mon","tue","wed","thu","fri","sat"};

	   for(int dayNumber=1;dayNumber<=dayList.length;dayNumber++){
			String dayName= dayList[dayNumber-1];
			System.out.println("day#"+dayNumber  +"  = " + dayName);		
	   
	   }
	      
	  
	}//end main

}//end class