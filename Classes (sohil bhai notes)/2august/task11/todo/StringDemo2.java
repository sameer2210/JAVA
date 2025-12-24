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

  //Date  21/08/2020
 public class StringDemo2 {

	public static void main(String args[]){
	 String str=new String("");
	 System.out.println("str = "+str);
	 for (int a = 1; a <= 10; a++) {
		 if(a<10){
		 	str  = str+a+",";
		 }else{
		 	str  = str+a;
		 }
	}
	 System.out.println("str = "+str);
	 
	}//end main

}//end class