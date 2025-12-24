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

  //Date  02/03/2020
 public class OtpDemo1 {

	public static void main(String args[]){
	java.util.Random rand  = new java.util.Random();
	 String otp="";
	 
	 for(int reqChar=1;reqChar<=4;reqChar++){
	    int digit  = rand.nextInt(10);//0-9
	  otp  = otp+ digit;
	 }
	 
	 System.out.println("4 digit otp = "+ otp);	 
	  
	}//end main

}//end class