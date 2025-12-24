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

  //Date  20/02/2020
 public class OtpDemo1 {

	public static void main(String args[]){
	 
		int num1 =    (int) (Math.random()*100) ;//(0-99)
		int num2 =    (int) (Math.random()*100) ;//(0-99)
		int num3 =    (int) (Math.random()*10) ;//(0-9)
		int num4 =    (int) (Math.random()*10) ;//(0-9)
		
	    char ch1 = (char) (65 +(num1%26));
	    char ch2 = (char) (65 +(num2%26));
		
		String generatedOtp = "";
		
		generatedOtp = generatedOtp+ch1+num3+ch2+num4;
		System.out.println("your opt is " + generatedOtp);
		
	
		java.util.Scanner scan  = new java.util.Scanner(System.in);
		System.out.println("enter your emailed/sms otp");
		//todo email
		String inputOtp = scan.next();//read  single word
		
		if(generatedOtp.equals(inputOtp)){
		  System.out.println("otp matched");
		
		}else{
		  System.out.println("sorry otp not  matched try again/re send to your inbox");
		}
	 
	}//end main

}//end class