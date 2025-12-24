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
 public class DigitSum {

	public static void main(String args[]){
			java.util.Scanner scan  = new java.util.Scanner(System.in);
			System.out.println("enter 3 digit int number");
			int num=scan.nextInt();
			int temp  =num;
			int d1;//unit digit
			int d2;//10th digit
			int d3;//100 digit
			int sum=0 ; //total sum of all digits
			
			 d1 = temp%10;
			 temp  = temp/10;    //12
			 
			 d2 = temp%10;
			 temp  = temp/10;    //1
			 
			  d3 = temp%10;
			 temp  = temp/10;     //0
			 
			 
			 //System.out.println(d3);//1
			// System.out.println(d2);//2
			// System.out.println(d1);//3
			 sum  = sum +d1 ;
			 sum  = sum +d2;
			 sum  = sum +d3;
			 
			System.out.println("____________________________");
			 System.out.println("sum "+sum);
			
			System.out.println("____________________________");
			int rev = 100*d1+10*d2+1*d3;
			System.out.println("rev = " +rev);
			
			System.out.println("____________________________");
			System.out.println(num==rev?"Palindrom":"NOT palindrom");
			
			
			
			
			
	  System.out.println();
	  
	}//end main

}//end class