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

  //Date  23/02/2020
 public class StringDemo2 {

	public static void main(String args[]){
	
	  String s1="SIS";
	  String s2="NIT";
	  String s3="SIS";
	  String s4="sis";
	  System.out.println("s1 = "+ s1);
	  System.out.println("s2 = "+ s2);
	  System.out.println("s3 = "+ s3);
	  System.out.println("s4 = "+ s4);
	  
	  System.out.println(s1.equals(s2));//F
	  System.out.println(s1.equals(s3));//T
	  System.out.println(s1.equals(s4));//F
	  System.out.println(s1.equalsIgnoreCase(s4));//F
	  
	  
	  
	  
	  
	  
	}//end main

}//end class