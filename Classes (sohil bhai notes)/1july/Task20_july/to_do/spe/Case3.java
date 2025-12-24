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
 public class Case3 {

	public static void main(String args[]){
	//A-L
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	System.out.println("how many char do you want print?");
	int totalPrint =scan.nextInt();
	System.out.println("what is start char");
	String str  =scan.next();
	char startChar=str.charAt(0);//'A';   //12
		for(int print=1;print<=totalPrint;print++){
		System.out.print(startChar++);
		}
	  System.out.print("\n");
	   
	  
	}//end main

}//end class