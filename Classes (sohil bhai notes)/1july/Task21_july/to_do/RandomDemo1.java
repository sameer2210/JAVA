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

  //Date  02/03/2020
 public class RandomDemo1 {

	public static void main(String args[]){
	java.util.Date currentDateAndTime  = new java.util.Date();
	System.out.println(currentDateAndTime);
	System.out.println(Math.random());
	System.out.println((int)(Math.random()*1000));
	int i = ((int)(Math.random()*10))%2;
	boolean r  = i==0?false:true;
	System.out.println(r);
	
	   
	  
	}//end main

}//end class