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
 public class Spe2{

	public static void main(String args[]){
			java.util.Scanner scan  = new java.util.Scanner(System.in);
			System.out.println("enter  int number");
			long num=scan.nextLong();
			long temp  =num;
			
			long sumC=0 ; //total sum of all digits
		 
			while(temp!=0){
				long r  = temp %10;
				temp  = temp/10;
				long digitC=(r*r*r);
				System.out.println(r +"^3 = "+digitC);
				 sumC = sumC  + digitC;  //121 =  1^3 +2^3+1^3 
			}
			
			System.out.println("sumC = "+ sumC);
			System.out.println(num==sumC?"armstrong" :"NOT armstrong");
			
			
			
			
			
			 
	}//end main

}//end class