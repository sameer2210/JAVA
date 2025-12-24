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

  //Date  28/01/2020
 public class Case4 {

	public static void main(String args[]){
	
	  char ch='A'; //2
	  int i  = 65;//4
	  
	  System.out.println("ch = " + ch);
	  System.out.println("i = " + i);
	  
      System.out.println("____________________");	  
	  //CTE ch  = i;
	  ch  = (char)i;  //OK
	  System.out.println("ch = " + ch);
	  System.out.println("______________________");
	  //ch  = 61234567;//CTE
	 
	  ch    =   66;  //ok  if it is in range
	  System.out.println("ch = " + ch);
	  
	  
	}//end main

}//end class