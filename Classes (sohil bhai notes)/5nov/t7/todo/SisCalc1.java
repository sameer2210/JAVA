/*
@Author:Surendra Kumar Sao
	>>Software Architect and Corporate Trainer
	>>+12 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	@copyright  surendra 2020
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 */

  //Date  25/10/2020
 public class SisCalc1 {

	public static void main(String args[]){
	
	String num1Str;
	String num2Str;
	int num1 ;
	int num2 ;
	
	num1Str  =args[0];  //"10"
	num2Str  =args[1];//	"20"
	
	num1  = Integer.parseInt(num1Str);
	num2  = Integer.parseInt(num2Str);
	
	int sum  = num1  + num2;
	float div  = (float)num1  / num2;
	System.out.println(num1 + " + " + num2 + " =  " +sum);
	System.out.println(num1 + " / " + num2 + " =  " +div);
	
	System.out.println("happy ending");
	  
	}//end main

}//end class