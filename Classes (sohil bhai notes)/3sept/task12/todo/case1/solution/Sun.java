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
 public class Sun{ 
 
 private static int total;
 
	 private  Sun(){
	  System.out.println(this +" created# " + ++total);
	} 
		
	private static Sun sunObject ; //null 
	
	public static Sun getSunObject(){
		 
		 if(sunObject==null){
		   sunObject  = new Sun();
		  }
	  
		return sunObject;
	}	
		
		
 }//End of class 
