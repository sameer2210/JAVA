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
 public class Spe1 {

	public static void main(String args[]){
			java.util.Scanner scan  = new java.util.Scanner(System.in);
			System.out.println("enter  integer type  number");
			long num=scan.nextLong();
			long temp  =num;
			
			long sum=0 ; //total sum of all digits
			long rev=0;
			
			while(temp!=0){
				long r  = temp %10;
				temp  = temp/10;
				rev = rev*10+r;    //123    (0*10+3)  + (3*10+2) + (32*10+1)
				sum = sum  +r;
				//System.out.print(r+",");
			}
			
			
			
	  System.out.println("sum = " + sum);
	  System.out.println("rev = " + rev);
	  
	}//end main

}//end class