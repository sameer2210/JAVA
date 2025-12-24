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
 public class Demo3 {

	public static void main(String args[]){
	
		java.util.Scanner scan  = new java.util.Scanner(System.in);
		
		int a;
		int b;
		int div;

			try{
				System.out.println("enter a");
				a  = scan.nextInt();//InputMismatchException
				System.out.println("enter b");
				b  = scan.nextInt();//InputMismatchException
				div = a/b;    // java.lang.ArithmeticException: / by zero
				System.out.println(" div = " + div);   //Int/Int =Int
			}catch(java.util.InputMismatchException  e){
			  System.out.println("Error : invalid int entered....");
			}catch(ArithmeticException  e){
			  System.out.println("ERROR msg : " + e.getMessage());
			  System.out.println("ERROR msg : b value must not be zero ");
			}catch(Exception  e){
			  System.out.println(" other ERROR msg : " + e.getMessage());
			}
			
		
		
		
		
		
		
		
	}//end main

}//end class