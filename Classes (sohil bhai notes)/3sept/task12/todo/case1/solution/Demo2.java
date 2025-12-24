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

  //Date  13/09/2020
 public class Demo2{

	public static void main(String args[]){
	
		System.out.println("__________________");
		/*Moon chandaMama  = new Moon();
		Moon eidKaChand  = new Moon();
		Moon chand  = new Moon();
		Moon chandrama  = new Moon();
		*/
		
		Moon chandaMama  = Moon.getInstance();
		Moon eidKaChand  =Moon.getInstance();
		Moon chand  = Moon.getInstance();
		Moon chandrama  = Moon.getInstance();
		
	  System.out.println("chandaMama = " +chandaMama);
	  System.out.println("eidKaChand = " +eidKaChand);
	  System.out.println("chand = " +chand);
	  System.out.println("chandrama = " +chandrama);
	  
	}//end main

}//end class