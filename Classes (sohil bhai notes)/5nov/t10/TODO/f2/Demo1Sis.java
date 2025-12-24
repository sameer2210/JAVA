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

  //Date  30/10/2020
 public class Demo1Sis {

	public static void main(String args[]){
	
		//String ob ="java";
		String ob =null;
		
		//String str  = ob.toUpperCase();   //new NullPointerException("String object must be exist");
		if(ob==null){
		  throw new NullPointerException("String object must be exist");
		}
		String str  = ob.toUpperCase();
		
		
		System.out.println("ob " + ob);
		System.out.println("upper str " + str);
		
	  
	}//end main

}//end class