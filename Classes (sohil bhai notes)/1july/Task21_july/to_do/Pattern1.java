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

  //Date  02/03/2020
 public class Pattern1 {

	public static void main(String args[]){
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	System.out.println("how many row required?");
		// int totalRow=5;
		 int totalRow=scan.nextInt();
	for(int r=1;r<=totalRow;r++){
	  //part-a
	    for(int plus=1;plus<=(totalRow-r);plus++){
		  System.out.print("+");
		}
	  //part-b
	  for(int star=1;star<=(2*r)-1;star++){
		  System.out.print("*");
	  
	  }
	  
	  //part-c
		for(int plus=1;plus<=(totalRow-r);plus++){
		  System.out.print("+");
		}
	
	  //part-d
	System.out.print("\n");
	
	}
	
	
	
	  
	  
	}//end main

}//end class