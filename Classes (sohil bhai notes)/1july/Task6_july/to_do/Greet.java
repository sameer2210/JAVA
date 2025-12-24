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

  //Date  27/01/2020				Greet.java
 public class Greet {

	public static void main(String args[]){
		
	 String name = System.getenv("username");
	 System.out.println("hello user " + name);
	  
	 java.util.Date now = new java.util.Date();
	 System.out.println("Date and time is  = " + now); 
	 
	 System.out.println(System.getenv("os"));
	 System.out.println(System.getenv("about"));
	 System.out.println(System.getenv("sis"));
	 System.out.println(System.getenv("student"));//null or value depend on env var setting
	  
	}//end main

}//end class