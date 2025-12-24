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

  //Date  18/08/2020
 public class SisCalc {

	public static void main(String args[]){
	 if(args.length!=2){
	  System.out.println("enter two number only");
	  System.exit(0);
	 }
	 
	 String num1Str  =args[0];
	 String num2Str  =args[1];
	 
	 int num1  = Integer.parseInt(num1Str);
	 int num2  = Integer.parseInt(num2Str);
	 int sum = num1+num2;
	 
	 System.out.println("num1= " + num1Str);
	 System.out.println("num2 =" + num2Str);
	 System.out.println("sum =" + sum);
	 
	  //System.out.println(num1Str + num2Str);
	  
	}//end main

}//end class