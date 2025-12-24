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

  //Date  19/08/2020
 public class Req1 {

	public static void main(String args[]){
	String name  = args[0];
	String ageStr  = args[1];
	String perStr  = args[2];
	String placedStr  = args[3];
	
	int age  = Integer.parseInt(ageStr);
	float per  = Float.parseFloat(perStr);
	boolean isPlaced  = Boolean.parseBoolean(placedStr);
	
	
	System.out.println(" name  " + name);
	System.out.println(" age  " + age);
	System.out.println(" per " + per);
	/*  if(per>90)
		if(per>80) 
	*/
	System.out.println(" placed ? " + isPlaced);
	
	}//end main

}//end class