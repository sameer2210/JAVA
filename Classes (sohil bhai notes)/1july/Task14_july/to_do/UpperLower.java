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

  //Date  21/02/2020
 public class UpperLower {

	public static void main(String args[]){
	
	   java.util.Scanner scan  = new java.util.Scanner(System.in);
	   System.out.println("enter alphabet");
	   String input  = scan.nextLine();//"a"//"A"//"Apple"	 "z" "X"  
	   char alphabet = input.charAt(0);
	   
	   if(alphabet>=65&&alphabet<=90){
	     //System.out.println("UPper Case");
		 char lower  =  (char)(alphabet +32);
		 System.out.println("lower case = " + lower);
		 
	   }else if(alphabet>=97&&alphabet<=122){
	   //  System.out.println("Lower Case");
		 char upper  =  (char)(alphabet -32);
		 System.out.println("Upper case = " + upper);
	   }else{
	    System.out.println("NOt a alphabet char");
	   }
	   
	   
	  
	}//end main

}//end class