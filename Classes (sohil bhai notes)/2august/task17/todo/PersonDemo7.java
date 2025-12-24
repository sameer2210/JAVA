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
 public class PersonDemo7{

	public static void main(String args[])throws Exception{
	
	Person myStudent  = new Person();
	
	myStudent.name="Keshari";
	myStudent.gender="male";
	myStudent.age=26;
	
	Thread.sleep(1000);
	myStudent.aboutMySelf();
	
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	myStudent.writeWinnerNotes("java is simple");
	Thread.sleep(1000);
	myStudent.writeWinnerNotes("I m fit");
	Thread.sleep(1000);
	myStudent.writeWinnerNotes("i m success");
	Thread.sleep(1000);
	Thread.sleep(1000);
	myStudent.writeWinnerNotes("i m happy");
	
	}//end main

}//end class