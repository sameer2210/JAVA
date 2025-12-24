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
 public class PersonDemo1 {

	public static void main(String args[]){
	
	Person p1  = new Person();
	Person p2  = new Person();
	
	p1.name="Gagan";
	p1.gender="Male";
	p1.age=26;
	
	  
	p2.name="Monika";
	p2.gender="Female";
	p2.age=23;
	System.out.println("p1 = " + p1);
	System.out.println("p2 = " + p2);
	
	System.out.println("_____________________________");
	p1.aboutMySelf();
	System.out.println("_____________________________");
	p2.aboutMySelf();
	
	}//end main

}//end class