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

  //Date  24/02/2020
 public class NumberToWord {

	public static void main(String args[]){
	
	   java.util.Scanner scan  = new java.util.Scanner(System.in);
	   System.out.println("enter number between 0-3");
	   int option =scan.nextInt();
	   
	   switch(option){
	   
	    case 0:
		       System.out.println("zero");
		break;	   
	    case 1:
		       System.out.println("one");
		break;	   
		 case 2:
		       System.out.println("two");
		break;	   
		 case 3:
		       System.out.println("three");
		break;	   
		default :
		   System.out.println("not in range");
		  break;
	   }
	   
	   
	   
	   
	  
	}//end main

}//end class