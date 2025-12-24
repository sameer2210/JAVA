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

  //Date  23/10/2020
 public class Case1Demo1 {

	public static void main(String args[]){
	
	X ref1  = new X();
	System.out.println(ref1 instanceof X);
	System.out.println(ref1 instanceof I1);
	System.out.println(ref1 instanceof I2);
	System.out.println("___________________");
	I1 ref2  = new X();
	
	
	System.out.println(ref2 instanceof X);
	System.out.println(ref2 instanceof I1);
	System.out.println(ref2 instanceof I2);
	I2 ref3  = new X();
	System.out.println("___________________");
	  
	System.out.println(ref3 instanceof X);
	System.out.println(ref3 instanceof I1);
	System.out.println(ref3 instanceof I2);
	  
	  
	}//end main

}//end class