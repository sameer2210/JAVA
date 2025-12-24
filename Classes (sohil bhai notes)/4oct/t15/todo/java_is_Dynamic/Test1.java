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

  //Date  04/10/2020
 public class Test1 {

	public static void main(String args[]) throws Exception{
	 java.util.Scanner scan  = new java.util.Scanner(System.in); 
	 
	System.out.println("which class do you want to load and create object?");
	String className=scan.nextLine();
	System.out.println("###################################");
	 Class c  =Class.forName(className);//load class/BluePrint
	System.out.println("###################################");
	 Object obj  = c.newInstance();//create object
	System.out.println("###################################");
	 System.out.println("obj = " + obj);
	 
	 
	}//end main

}//end class