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
 public class SisCalc2 {

	public static void main(String args[]){
	 if(args.length==0){
	  System.out.println("no number passed plz pass numbers...");
	  System.exit(0);//close app
	 }
	  
	 int sum = 0;
	 for(int e=1;e<=args.length;e++){
	    String numStr  = args[e-1];
		int temp  = Integer.parseInt(numStr);
		sum = sum  + temp;
	 }
	 
	  
	 System.out.println("sum =" + sum);
	 
	 
	}//end main

}//end class