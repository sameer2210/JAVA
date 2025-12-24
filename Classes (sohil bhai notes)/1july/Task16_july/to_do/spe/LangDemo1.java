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
 public class LangDemo1 {

	public static void main(String args[]){
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	  System.out.println("enter lang for details");
	  String lang =scan.nextLine();
	   switch(lang){
	    case "c":
			System.out.println("mother language");
		break;
		case "cpp":
			System.out.println("c++ support oops,oo...");
		break;
		case "java":
			System.out.println("java pi,secure,robust ,simple, .....");
		break;
		case "html":
			System.out.println("use for create web pages...");
		break;
		default  :
		 System.out.println("not details found ");
		break;
		}
	  
	}//end main

}//end class