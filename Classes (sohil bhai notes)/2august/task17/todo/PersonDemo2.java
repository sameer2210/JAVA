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
 public class PersonDemo2 {

	public static void main(String args[])throws Exception{
	
	Person mystudent  = new Person();
	
	mystudent.name="Karan";
	mystudent.gender="Male";
	mystudent.age=22;
	mystudent.aboutMySelf();
	Thread.sleep(2000);
	int givenNumber = mystudent.giveNumber() ;
	System.out.println("given number is " + givenNumber);
	
	
	
	}//end main

}//end class