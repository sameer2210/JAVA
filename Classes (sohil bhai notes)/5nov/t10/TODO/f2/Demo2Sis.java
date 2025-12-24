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
 public class Demo2Sis {

	public static void main(String args[]){
	
		 java.util.Scanner scan  = new java.util.Scanner(System.in);
		 int a;
		 int b;
		 int div;
		System.out.println("enter 2 integer");
		a  = scan.nextInt();
		b  = scan.nextInt();
		if(b==0){
		   throw new ArithmeticException("/ by zero : b must be non zero");
		}
		div = a/b; // JVM sub program   throw new ArithmeticException("/ by zero");
		System.out.println("div "+ div);
		
	  
	}//end main
}//end class