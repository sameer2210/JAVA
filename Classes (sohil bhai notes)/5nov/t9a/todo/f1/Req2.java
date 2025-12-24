/*
@Author:Surendra Kumar Sao
	>>Software Architect and Corporate Trainer
	>>+12 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	@copyright  surendra 2020
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 */

  //Date  29/10/2020
 public class Req2 {

	public static void main(String args[]){

	java.util.Scanner scan  = new java.util.Scanner(System.in);
	
	int value;
	
	System.out.println("enter int value");
	while(true){
				try{
					value  = Integer.parseInt(scan.nextLine()); 
					System.out.println("int value  = "+value);
					break;
				}catch(NumberFormatException  e){
				  System.out.println("Error : invalid integer number");
				  System.out.println("re-enter int value");
				}
	}//while
	
	
	
	
	
	  
	}//end main

}//end class