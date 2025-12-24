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

  //Date  30/10/2020
 public class Case2 {

	public static void main(String args[]){
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	  int a;
	  int b;
	  int div;
	  try{
		  System.out.println("operation start..");
		  a  = Integer.parseInt(scan.nextLine());
		  b  = Integer.parseInt(scan.nextLine());
		  System.out.println("b = " + b);
		  System.out.println("a = " + a);
		  div = a/b;
		  System.out.println("div = " + div);
		  System.out.println("operation done");//must be execute 
	  }catch(ArithmeticException  e){
			System.out.println("AE ERROR " +e.getMessage() +" b  must be non zero");
	  }catch(NumberFormatException  e){
	  System.out.println("ERROR : input must be integer type");
	  }catch(Exception  e){
			System.out.println("ERROR " +e.getMessage());
	  }
		
		System.out.println("_________________");
		System.out.println("Happy ending");
		System.out.println("We are engineer");
	  
	}//end main

}//end class