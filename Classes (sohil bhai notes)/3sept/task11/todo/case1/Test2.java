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

  //Date  12/09/2020
 public class Test2 {

	public static void main(String args[]){
	 X ob = null;
	 System.out.println("ob = " + ob);
	 //System.out.println("ob.a " +ob.a);  //RunTimeError  NPE
	   ob  =new X();
	 System.out.println("ob = " + ob);
	 System.out.println("ob.a " +ob.a);//OK 
	 System.out.println("ob.b " +ob.b);//OK 
	 System.out.println("X.b " +X.b);//OK 
	 
	 
	 
	  
	}//end main

}//end class