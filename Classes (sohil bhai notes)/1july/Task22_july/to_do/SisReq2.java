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
 public class SisReq2{

	public static void main(String args[]){
		 //nth term sum
			int  num=123456789;
			
		 long startTime  = System.nanoTime();
		 int d= num%10;
		int sum= (d*(d+1) )/2; //total sum of all digits
		 long endTime  = System.nanoTime();
			System.out.println("totalTime= "+ (endTime-startTime)+"ns");
			System.out.println("num= "+ num);
			System.out.println("sum = "+ sum);
			
			
			
			
			 
	}//end main

}//end class