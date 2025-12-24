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
 public class StringBuilderDemo2 {

	public static void main(String args[]){
	
	  StringBuilder sb  = new StringBuilder("ABjava job happy salary sad");
	  System.out.println(sb);//ABjava job happy salary sad
	  sb.deleteCharAt(0);
	  System.out.println(sb);//Bjava job happy salary sad
	  sb.deleteCharAt(0);
	  System.out.println(sb);//java job happy salary sad
	  
	  sb.delete(5,8);
	  System.out.println(sb);//java  happy salary sad

	  
	  
	}//end main

}//end class