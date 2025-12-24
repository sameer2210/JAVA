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
 public class StringBuilderDemo1 {

	public static void main(String args[]){
	
	  String str="SISJAVANIT";
	  
	  StringBuilder sb  = new StringBuilder(str);
	  
	  System.out.println(sb);
	  sb.append("PI");
	  System.out.println(sb);
	  sb.insert(0,"Surendra");
	  System.out.println(sb);
	  
	  sb.insert(sb.length(),"happy");
	  System.out.println(sb);

// SISJAVANIT
// SISJAVANITPI
// SurendraSISJAVANITPI
// SurendraSISJAVANITPIhappy
	  
	  
	}//end main

}//end class