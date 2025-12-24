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
 public class TestA {

	public static void main(String args[]){
	
java.util.Scanner scan  = new java.util.Scanner(System.in);
	
	System.out.println("which type object you want to create>>");
	String bluePrintName  = scan.nextLine();
	
	Class c  = Class.forName(bluePrintName);//ClassNotFoundException
	Object ob  =c.newInstance();  
	//InstantiationException
	//IllegalAccessException
	System.out.println("created object  = " + ob);
	
			  
	}//end main

}//end class