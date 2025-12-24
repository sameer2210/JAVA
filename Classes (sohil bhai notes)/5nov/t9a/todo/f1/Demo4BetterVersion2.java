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
 public class Demo4BetterVersion2 {

	public static void main(String args[]){
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	
	System.out.println("which type object you want to create>>");
	String bluePrintName  = scan.nextLine();
	try{
	Class c  = Class.forName(bluePrintName);//class loaded...java.lang.ClassNotFoundException
	Object ob  =c.newInstance();   //java.lang.InstantiationException(interface or abstract class, if class has not present default constructor ) IllegalAccessException
	System.out.println("created object  = " + ob);
	
	}catch(ClassNotFoundException e){
	   System.out.println("ERROR : give type "+ bluePrintName  +" not exist");
	}catch(InstantiationException e){
	   System.out.println("ERROR : give type "+ bluePrintName  +" Must not be Inteface or abstract class Or class must  have default constrcutor");
	}catch(IllegalAccessException e){
	   System.out.println("ERROR : can not create object of  "+ bluePrintName  +" because : it has private constructor" );
	}catch(Exception e){
	
	  System.out.println("Error : "+ e.getMessage());
	}
	
	
	  
	}//end main

}//end class