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

  //Date  31/08/2020
 public class PersonDemo6 {

	public static void main(String args[])throws Exception{
	
	Person myStudent  = new Person();
	
	myStudent.name="Rita";
	myStudent.gender="Female";
	myStudent.age=21;
	
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	
	System.out.println("Trainer String > ");
	String inputStr  = scan.nextLine();
	int totalWords;
	 totalWords  =myStudent.totalWords(inputStr);
	 	 
	System.out.println("total words = "+totalWords);
	
	
	
	}//end main

}//end class