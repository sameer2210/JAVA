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

  //Date  29/01/2020
 public class ScannerDemo1 {

	public static void main(String args[]){
	
	 String src="22 60.7 true 99.8";
	 
	 java.util.Scanner scan =  new java.util.Scanner(src);
	 
	 int age   = scan.nextInt();
	 float weight = scan.nextFloat();
	 boolean isFit =scan.nextBoolean();
	 double percentage =scan.nextDouble();
	 
	 System.out.println(age);
	 System.out.println(weight);
	 System.out.println(isFit);
	 System.out.println(percentage);
	  
	}//end main

}//end class