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

  //Date  29/10/2020
 public class Demo2 {

	public static void main(String args[]){
	java.util.Random rand  = new java.util.Random();
	
	Ball b1  =null;
	if(rand.nextBoolean()){
		b1  = new Ball();
	}
	System.out.println("b1 = " + b1);
	try{
		b1.bounce();
	}catch(NullPointerException e){
	   //System.out.println("ERROR : "+ e.getMessage());
	   System.out.println("ERROR : No Ball found for bouncing ");
	}	
		
		
		
		
		
		
		
		
	}//end main

}//end class