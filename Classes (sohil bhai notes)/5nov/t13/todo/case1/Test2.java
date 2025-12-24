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

  //Date  02/11/2020
 public class Test2 {

	public static void main(String args[]){
			//way1
			X.m2();   //not handled optional   , and exception  can be come or not
			
			//way2
			try{
				X.m2();   // handled optional
			}catch(RuntimeException e){   System.out.println(e.getMessage());}
			
	}//end main

}//end class