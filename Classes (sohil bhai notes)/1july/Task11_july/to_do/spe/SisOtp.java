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

  //Date  01/02/2020
 public class SisOtp {

	public static void main(String args[]){
	  int a = (int)(Math.random()*10);
	  int b = (int)(Math.random()*10);
	  int c = (int)(Math.random()*10);
	  int d = (int)(Math.random()*10);
	 int otp = a*1000+b*100+c*10 +d*1;
	
	//TODO  EMAIl
	System.out.println("_________in Gmail______________");
	System.out.println("check your email  otp = "+ otp);
	System.out.println("_________________________");
	
java.util.Scanner scan  = new java.util.Scanner(System.in);
	System.out.println("Enter your opt ");
	int userOtp =scan.nextInt();
	
	if(otp==userOtp){
	  System.out.println("matched otp :....continue..");
	}else{
	   System.out.println("re-enter/try again... resend");
	}
	
	
	 
	 
	 
	  
	}//end main

}//end class