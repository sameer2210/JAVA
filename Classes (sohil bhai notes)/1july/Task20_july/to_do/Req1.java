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

  //Date  01/03/2020
 public class Req1 {

	public static void main(String args[]){
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	System.out.println("enter your int type number");
	long number  =scan.nextLong();
	
	String str = number +"  is ";
	
	if(number>=0&& number<=9){
		str  = str+" 1 digit number";
	}else if(number>=10&& number<=99){
		str  = str+" 2 digit number";
	}else if(number>=100&& number<=999){
		str  = str+" 3digit number";
	}else if(number>=1000&& number<=9999){
		str  = str+" 4 digit number";
	}else if(number>=10000&& number<=99999){
		str  = str+" 5 digit number";
	}else{
		str  = str+" more than 5 digit number";
	}
	
	
	System.out.println("______________________");
	
	  System.out.println("num =" + number);
	  System.out.println(str);
	  
	  System.out.println("___________________");
	  String numStr  ="" +number;
	  String msg  = number +"  is "+ numStr.length() +" digit number";
	  System.out.println(msg);
	  
	  
	  
	  
	}//end main

}//end class