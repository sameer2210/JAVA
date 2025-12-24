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

  //Date  03/03/2020
 public class SisReq1{

	public static void main(String args[]){
		 
			int  num=123456789;
			int temp  =num;
			
			int sum=0 ; //total sum of all digits
		 //long startTime  = System.currentTimeMillis();
		 long startTime  = System.nanoTime();
			while(temp!=0){
				int r  = temp%10;
				temp  = temp/10;
				 sum =sum + r;
			}
		 long endTime  = System.nanoTime();
			System.out.println("totalTime= "+ (endTime-startTime)+"ns");
			System.out.println("num= "+ num);
			System.out.println("sum = "+ sum);
			
			
			
			
			 
	}//end main

}//end class