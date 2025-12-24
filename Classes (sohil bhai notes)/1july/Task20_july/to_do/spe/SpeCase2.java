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

  //Date  01/03/2020
 public class SpeCase2 {

	public static void main(String args[]){
		
		char ch='A';
	   for(int row=1;row<=7;row++){
	         for(int col=1;col<=4;col++){
			  //System.out.print(ch++);
			  if(ch<='Z'){
			  System.out.printf("%4s",ch++);
			  }else{
			  System.out.printf("%4s"," ");//		  System.out.printf("%c",' ');
			  }
			 }
	   System.out.print("\n");
	   }
	  
	}//end main

}//end class