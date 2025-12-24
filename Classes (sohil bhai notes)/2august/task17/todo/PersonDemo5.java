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
 public class PersonDemo5 {

	public static void main(String args[])throws Exception{
	
	Person myStudent  = new Person();
	
	myStudent.name="Rita";
	myStudent.gender="Female";
	myStudent.age=21;
	
	int totalWords;
	 totalWords  =myStudent.totalWords("java is simple");
	System.out.println(totalWords);
	
	 totalWords  =myStudent.totalWords("success is simple if you believe");
	System.out.println(totalWords);
	
	
	
	}//end main

}//end class