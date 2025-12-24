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
 public class Req2 {

	public static void main(String args[]){
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	
	int a;
	int b;
	int c;
	System.out.println("enter a");
	a =scan.nextInt();
	System.out.println("enter b");
	b =scan.nextInt();
	System.out.println("enter c");
	c =scan.nextInt();
	int big = a>b?(a>c?a:c):( b>c?b:c);
	System.out.println("big is " + big);
	
	
			int big2 = a>b?a>c?a:c:b>c?b:c;
	
	System.out.println("big is " + big2);
	
	  System.out.println();
	  
	}//end main

}//end class