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

  //Date  04/03/2020
 public class StringDemo3 {

	public static void main(String args[]){
	
	 
	 String s1=new String("java ");
	 System.out.println(s1);//java
	 s1.concat("sis");
	 System.out.println(s1);//java
	 
	 System.out.println("++++++++++++++++++");
	 StringBuilder sb=new StringBuilder("java");
	 System.out.println(sb);//java
	 sb.append("sis");
	 System.out.println(sb);//javasis
	  
	}//end main

}//end class