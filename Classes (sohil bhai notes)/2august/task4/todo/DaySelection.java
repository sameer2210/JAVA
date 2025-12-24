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
 public class DaySelection {

	public static void main(String args[])throws Exception{
	java.util.Random rand  = new java.util.Random();
	
	   String [] dayList = new String[7];
	   
	   dayList[0]="sun";
	   dayList[1]="mon";
	   dayList[2]="tue";
	   dayList[3]="wed";
	   dayList[4]="thu";
	   dayList[5]="fri";
	   dayList[6]="sat";
	   
	   System.out.println("total day " + dayList.length);
	   for(int pick=1;pick<=10;pick++){
			Thread.sleep(1000*(rand.nextInt(3)+1));
			
			int pickDayIndex= rand.nextInt(dayList.length);//0-size-1
			String pickDay= dayList[pickDayIndex];
			
			System.out.print("\r"+pickDay.toUpperCase());//view cui gui web mobile
	   
	   }
	   	  
	}//end main

}//end class