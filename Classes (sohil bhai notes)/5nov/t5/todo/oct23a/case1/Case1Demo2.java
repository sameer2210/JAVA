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
 public class Case1Demo2 {

	public static void main(String args[]){
	
	X ref1  = new X();
	ref1.m1();
	ref1.m2();
	ref1.m3();
	System.out.println("___________________");
	
	I1 ref2  = new X();
	ref2.m1();
	
	//CTE ref2.m2();// why I1 don't know about m2
	//CTE ref3.m3();// why I1 don't know about m3
	System.out.println("___________________");
	
	I2 ref3  = new X();
	//CTE ref3.m1(); // why I2 don't know about m1
	ref3.m2();
	ref3.m3();
	  
		}//end main

}//end class